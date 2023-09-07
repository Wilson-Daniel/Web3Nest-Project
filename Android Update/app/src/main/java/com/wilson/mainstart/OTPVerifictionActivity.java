package com.wilson.mainstart;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthOptions;
import com.google.firebase.auth.PhoneAuthProvider;
import com.wilson.mainstart.OTPAutoClass.OTP_Receiver;
import com.wilson.mainstart.databinding.ActivityOtpverifictionBinding;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

public class OTPVerifictionActivity extends AppCompatActivity {
    private ActivityOtpverifictionBinding binding;
    private String verificationId;
    private OTP_Receiver otp_receiver;
    private FirebaseAuth mAuth;
    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityOtpverifictionBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        mAuth = FirebaseAuth.getInstance();
        editTextInput();

        binding.tvMobile.setText(String.format(
                "+91-%s", getIntent().getStringExtra("phone number")
        ));

        verificationId = getIntent().getStringExtra("verificationId");

        binding.otpverificationTVResendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(OtpVerifyActivity.this, "OTP Send Successfully.", Toast.LENGTH_SHORT).show();
                againOtpSend();
            }
        });

        binding.otpverificationBTNVerify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                binding.progressBarVerify.setVisibility(View.VISIBLE);
                binding.otpverificationBTNVerify.setVisibility(View.INVISIBLE);
                Intent intent = new Intent(OTPVerifictionActivity.this, MainActivity2.class);
                startActivity(intent);
                if (binding.otpverificationETC1.getText().toString().trim().isEmpty() ||
                        binding.otpverificationETC2.getText().toString().trim().isEmpty() ||
                        binding.otpverificationETC3.getText().toString().trim().isEmpty() ||
                        binding.otpverificationETC4.getText().toString().trim().isEmpty() ||
                        binding.otpverificationETC5.getText().toString().trim().isEmpty() ||
                        binding.otpverificationETC6.getText().toString().trim().isEmpty()) {
                    Toast.makeText(OTPVerifictionActivity.this, "OTP is not Valid!", Toast.LENGTH_SHORT).show();
                } else {
                    if (verificationId != null) {
                        String code = binding.otpverificationETC1.getText().toString().trim() +
                                binding.otpverificationETC2.getText().toString().trim() +
                                binding.otpverificationETC3.getText().toString().trim() +
                                binding.otpverificationETC4.getText().toString().trim() +
                                binding.otpverificationETC5.getText().toString().trim() +
                                binding.otpverificationETC6.getText().toString().trim();

                        PhoneAuthCredential credential = PhoneAuthProvider.getCredential(verificationId, code);
                        FirebaseAuth
                                .getInstance()
                                .signInWithCredential(credential)
                                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            binding.progressBarVerify.setVisibility(View.VISIBLE);
                                            binding.otpverificationBTNVerify.setVisibility(View.INVISIBLE);
                                            Toast.makeText(OTPVerifictionActivity.this, "Welcome...", Toast.LENGTH_SHORT).show();
                                            Intent intent = new Intent(OTPVerifictionActivity.this, MainActivity2.class);
                                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                                            startActivity(intent);
                                        } else {
                                            binding.progressBarVerify.setVisibility(View.GONE);
                                            binding.otpverificationBTNVerify.setVisibility(View.VISIBLE);
                                            Toast.makeText(OTPVerifictionActivity.this, "OTP is not Valid!", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                    }
                }
            }
        });

        autoOtpReceiver();
    }

    private void autoOtpReceiver() {
        otp_receiver = new OTP_Receiver();
        this.registerReceiver(otp_receiver, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
        otp_receiver.initListener(new OTP_Receiver.OtpReceiverListener() {
            @Override
            public void onOtpSuccess(String otp) {
                int o1 = Character.getNumericValue(otp.charAt(0));
                int o2 = Character.getNumericValue(otp.charAt(1));
                int o3 = Character.getNumericValue(otp.charAt(2));
                int o4 = Character.getNumericValue(otp.charAt(3));
                int o5 = Character.getNumericValue(otp.charAt(4));
                int o6 = Character.getNumericValue(otp.charAt(5));

                binding.otpverificationETC1.setText(String.valueOf(o1));
                binding.otpverificationETC2.setText(String.valueOf(o2));
                binding.otpverificationETC3.setText(String.valueOf(o3));
                binding.otpverificationETC4.setText(String.valueOf(o4));
                binding.otpverificationETC5.setText(String.valueOf(o5));
                binding.otpverificationETC6.setText(String.valueOf(o6));
            }

            @Override
            public void onOtpTimeout() {
                Toast.makeText(OTPVerifictionActivity.this, "Something went wrong!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void againOtpSend() {
//        binding.progressBarVerify.setVisibility(View.VISIBLE);
//        binding.otpverificationBTNVerify.setVisibility(View.INVISIBLE);

        mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

            @Override
            public void onVerificationCompleted(PhoneAuthCredential credential) {

            }

            @Override
            public void onVerificationFailed(FirebaseException e) {
                binding.progressBarVerify.setVisibility(View.GONE);
                binding.otpverificationBTNVerify.setVisibility(View.VISIBLE);
                Toast.makeText(OTPVerifictionActivity.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCodeSent(@NonNull String verificationId,
                                   @NonNull PhoneAuthProvider.ForceResendingToken token) {
                binding.progressBarVerify.setVisibility(View.GONE);
                binding.otpverificationBTNVerify.setVisibility(View.VISIBLE);
                Toast.makeText(OTPVerifictionActivity.this, "OTP is successfully send.", Toast.LENGTH_SHORT).show();
            }
        };

        PhoneAuthOptions options =
                PhoneAuthOptions.newBuilder(mAuth)
                        .setPhoneNumber("+91" + getIntent().getStringExtra("phone number").trim())
                        .setTimeout(60L, TimeUnit.SECONDS)
                        .setActivity(this)
                        .setCallbacks(mCallbacks)
                        .build();
        PhoneAuthProvider.verifyPhoneNumber(options);
    }

    private void editTextInput() {
        binding.otpverificationETC1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.otpverificationETC2.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.otpverificationETC2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.otpverificationETC3.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.otpverificationETC3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.otpverificationETC4.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.otpverificationETC4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.otpverificationETC5.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        binding.otpverificationETC5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                binding.otpverificationETC6.requestFocus();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (otp_receiver != null) {
            unregisterReceiver(otp_receiver);
        }
    }
}