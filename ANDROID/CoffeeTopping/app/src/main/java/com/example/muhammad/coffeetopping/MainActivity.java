package com.example.muhammad.coffeetopping;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.Editable;
        import android.view.Display;
        import android.view.View;
        import android.widget.CheckBox;
        import android.widget.EditText;
        import android.widget.TextView;

        import java.text.NumberFormat;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.TextView;
        import android.widget.Toast;

        import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the + button is clicked.
     */
    public void increment(View view){
        if(quantity == 100){
            Toast.makeText(this,"You can't order more than 100 cup of coffees", Toast.LENGTH_SHORT).show();
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }

    /**
     * This method is called when the - button is clicked.
     */
    public void decrement(View view){
        if(quantity <= 1) {
            Toast.makeText(this,"You can order atleast 1 cup of coffees", Toast.LENGTH_SHORT).show();
            return;//this statement says immidiately exit from the method
        }
        quantity = quantity - 1;
        display(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        EditText name =(EditText) findViewById(R.id.name_edit_view);
        String userName = name.getText().toString();

        CheckBox whippedCream = (CheckBox) findViewById(R.id.whipped_cream);
        boolean hasWhippedCream = whippedCream.isChecked();

        CheckBox chocolate = (CheckBox) findViewById(R.id.chocolate);
        boolean hasChocolate = chocolate.isChecked();

        displayMessage(createOrderSummary(calculatePrice(hasWhippedCream,hasChocolate), hasWhippedCream, hasChocolate, userName));
    }

    private int calculatePrice(boolean addWhippedCream, boolean addChocolate){
        /* Price 1 cup of coffee*/
        int basePrice = 5;

        /* Add $1 if the uesr wants whipped cream*/
        if(addWhippedCream){
            basePrice = basePrice + 1;
        }

        /* Add $2 if user wants chocolate */
        if(addChocolate){
            basePrice = basePrice +2;
        }

        return  quantity * basePrice;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }

    private String createOrderSummary(int price, boolean addWhippedCream, boolean addChocolate, String string){
        String priceMessage = "Name: " + string;
        priceMessage = priceMessage + "\nAdd Whipped Cream? " + addWhippedCream;
        priceMessage = priceMessage + "\nAdd Chocolate? " + addChocolate;
        priceMessage = priceMessage + "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank You!";
        return priceMessage;
    }
}

