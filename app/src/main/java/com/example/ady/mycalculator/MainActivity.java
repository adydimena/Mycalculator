package com.example.ady.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.E;
import static java.lang.Math.acos;
import static java.lang.Math.asin;
import static java.lang.Math.cos;
import static java.lang.Math.floor;
import static java.lang.Math.log;
import static java.lang.Math.pow;
import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static java.lang.Math.tan;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private TextView mem;
    double screenpresente;
    char operation;
    double result;
    boolean allowwirte = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = findViewById(R.id.display);
        mem = findViewById(R.id.memorydispay);
        screen.setText("");
        mem.setText("");



    }

    public void clear(View view) {
        screen.setText("");
        mem.setText("");
        allowwirte = true;
    }

    public void delete(View view) {
        String dummy = screen.getText().toString();
        double per100 = Double.parseDouble(dummy);
        int finalres;
        per100 = per100/10;
        per100 = floor(per100);
        finalres = (int)per100;
        dummy = Integer.toString(finalres);
        screen.setText(dummy);

    }

    public void percentage(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append(dummy);
        mem.append(" % ");
        double per100 = Double.parseDouble(dummy);
        result = per100 /100;

        dummy = Double.toString(result);
        screen.setText(dummy);

    }

    public void division(View view) {
        if (!allowwirte) {
            //screen.setText("");
            mem.setText("");
            allowwirte = true;

        }
        if (mem.getText() != "")
        {
            mem.append(" / ");

        }
        String dummy = screen.getText().toString();
        screenpresente = Double.parseDouble(dummy);
        mem.append(dummy);

        screen.setText("");
        operation = '/';
        mem.append(" / ");

    }

    public void showdigit(View view) {

        if (!allowwirte) {
            screen.setText("");
            mem.setText("");
            allowwirte = true;

        }
        Button btn = (Button) view;
        String btnDigit = btn.getText().toString();

        screen.append(btnDigit);

    }

    public void Multiplication(View view) {
        if (!allowwirte) {
            //screen.setText("");
            mem.setText("");
            allowwirte = true;

        }
        if (mem.getText() != "")
        {
            mem.append(" * ");

        }
        String dummy = screen.getText().toString();
        screenpresente = Double.parseDouble(dummy);
        mem.append(dummy);
        mem.append(" * ");

        screen.setText("");
        operation = '*';
    }

    public void Add(View view) {
        if (!allowwirte) {
            // screen.setText("");
            mem.setText("");
            allowwirte = true;

        }
        if (mem.getText() != "")
        {
            mem.append(" + ");

        }
        String dummy = screen.getText().toString();
        screenpresente = Double.parseDouble(dummy);
        mem.append(dummy);
        mem.append(" + ");
        screen.setText("");
        operation = '+';
    }

    public void subtration(View view) {
        if (!allowwirte) {
            //screen.setText("");
            mem.setText("");
            allowwirte = true;

        }
        if (mem.getText() != "")
        {
            mem.append(" - ");

        }
        String dummy = screen.getText().toString();
        screenpresente = Double.parseDouble(dummy);
        mem.append(dummy);
        mem.append(" - ");
        screen.setText("");
        operation = '-';
    }

    public void equal(View view) {
        String dummy = screen.getText().toString();
        double operant = Double.parseDouble(dummy);
        switch (operation)
        {
            case '*':
                result = operant * screenpresente;
                break;
            case '/':
                result = operant / screenpresente;
                break;
            case '+':
                result = operant - (-screenpresente);
                break;
            case '-':
                result = operant - screenpresente;
                break;
        }
        mem.append(dummy);
        dummy = Double.toString(result);
        screen.setText("");
        screen.setText(dummy);
        //mem.setText("");
        allowwirte = false;

    }

    public void history(View view) {
    }

    public void doSin(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("sin");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = sin(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);

    }

    public void doCos(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("cos");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = cos(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void doTan(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("tan");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = tan(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void doArcSin(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("Arcsin");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = asin(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void showE(View view) {

        mem.setText("");
        screen.setText("");

        mem.append("E");



        String dummy = Double.toString(E);

        screen.setText(dummy);
    }

    public void doArchcosi(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("archcos");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = acos(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void dosquare(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("square of");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = pow(per100,2) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void do2root(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("square Root of");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = sqrt(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void doLn(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("ln");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = log((1-per100)/per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }

    public void dolog(View view) {
        String dummy = screen.getText().toString();
        mem.setText("");
        mem.append("log");
        mem.append("(");
        mem.append(dummy);
        mem.append(")");

        double per100 = Double.parseDouble(dummy);
        result = log(per100) ;

        dummy = Double.toString(result);
        screen.setText(dummy);
    }
}
