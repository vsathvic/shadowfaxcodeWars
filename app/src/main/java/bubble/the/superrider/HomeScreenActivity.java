package bubble.the.superrider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setTitle(R.string.homescreen_title);
        setContentView(R.layout.activity_home_screen);

        Button pickupButton = (Button) findViewById(R.id.pickupButton);
        pickupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showPickupAddress();
            }
        });

        Button deliveryButton = (Button) findViewById(R.id.deliveryButton);
        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDeliveryAddress();
            }
        });

        Button codButton = (Button) findViewById(R.id.codButton);
        deliveryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showCodPaymentPage();
            }
        });

    }

    private void showPickupAddress() {
        Intent intent = new Intent(this, PickupMapActivity.class);
    }

    private void showDeliveryAddress() {
        Intent intent = new Intent(this, PickupMapActivity.class);
    }

    private void showCodPaymentPage() {
        Intent intent = new Intent(this, CODPaymentActivity.class);
    }
}
