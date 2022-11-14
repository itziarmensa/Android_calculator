package edu.upc.dsa.androidcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    float numero1 = 0;
    float numero2 = 0;
    String operacio = "";

    TextView text;
    TextView unitats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.resultat);
        unitats = findViewById(R.id.unitatss);

    }

    public void clear(View view) {
        text.setText("0");
    }

    public void zero(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("0");
        }else{
            text.setText(text.getText()+"0");
        }
    }

    public void u(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("1");
        }else{
            text.setText(text.getText()+"1");
        }
    }

    public void dos(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("2");
        }else{
            text.setText(text.getText()+"2");
        }
    }

    public void tres(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("3");
        }else{
            text.setText(text.getText()+"3");
        }
    }

    public void quatre(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("4");
        }else{
            text.setText(text.getText()+"4");
        }
    }

    public void cinc(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("5");
        }else{
            text.setText(text.getText()+"5");
        }
    }

    public void sis(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("6");
        }else{
            text.setText(text.getText()+"6");
        }
    }

    public void set(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("7");
        }else{
            text.setText(text.getText()+"7");
        }
    }

    public void vuit(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("8");
        }else{
            text.setText(text.getText()+"8");
        }
    }

    public void nou(View view) {
        if(Float.parseFloat(text.getText().toString()) == 0){
            text.setText("9");
        }
        else{
            text.setText(text.getText()+"9");
        }
    }

    public void coma(View view) {
        text.setText(text.getText()+".");
    }

    public void radians(View view) {
        unitats.setText("radianes");
    }

    public void graus(View view) {
        unitats.setText("grados");
    }

    public void suma(View view) {
        numero1 = Float.parseFloat(text.getText().toString());
        operacio = "+";
        text.setText("0");
    }

    public void resta(View view) {
        numero1 = Float.parseFloat(text.getText().toString());
        operacio = "-";
        text.setText("0");
    }

    public void multiplicacio(View view) {
        numero1 = Float.parseFloat(text.getText().toString());
        operacio = "*";
        text.setText("0");
    }

    public void divisió(View view) {
        numero1 = Float.parseFloat(text.getText().toString());
        operacio = "/";
        text.setText("0");
    }

    public void sin(View view) {
        if (unitats.getText().toString() == ""){
            Toast.makeText(this, "Especifica las unidades por favor.", Toast.LENGTH_LONG).show();
        }else{
            operacio = "sin";
            text.setText("0");
        }

    }

    public void cos(View view) {
        if (unitats.getText().toString() == ""){
            Toast.makeText(this, "Especifica las unidades por favor.", Toast.LENGTH_LONG).show();
        }else{
            operacio = "cos";
            text.setText("0");
        }

    }

    public void tan(View view) {
        if (unitats.getText().toString() == ""){
            Toast.makeText(this, "Especifica las unidades por favor.", Toast.LENGTH_LONG).show();
        }else{
            operacio = "tan";
            text.setText("0");
        }

    }

    public void pi(View view) {
        text.setText(Math.PI+"");

    }

    public void resultat(View view) {
        numero2 = Float.parseFloat(text.getText().toString());
        if(operacio.equals("+")){
            text.setText(numero1 + numero2 + "");
        }
        if(operacio.equals("-")){
            text.setText(numero1 - numero2 + "");
        }
        if(operacio.equals("*")){
            text.setText(numero1 * numero2 + "");
        }
        if(operacio.equals("/")){
            if(numero2 == 0){
                Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
            }else{
                text.setText(numero1 / numero2 + "");
            }
        }
        if(operacio.equals("sin")){
            if(unitats.getText().toString() == "radianes"){
                double result = Math.sin(numero2);
                String resultado = Double.toString(result);
                text.setText(resultado);
            }else{
                numero2= (float) (numero2*Math.PI/180);
                double result= Math.sin(numero2);
                String resultado=Double.toString(result);
                text.setText(resultado);
            }

        }
        if(operacio.equals("tan")){
            if(unitats.getText().toString() == "radianes"){
                double result = Math.tan(numero2);
                String resultado = Double.toString(result);
                text.setText(resultado);
            }else{
                numero2= (float) (numero2*Math.PI/180);
                double result= Math.tan(numero2);
                String resultado=Double.toString(result);
                text.setText(resultado);
            }

        }
        if(operacio.equals("cos")){
            if(unitats.getText().toString() == "radianes"){
                double result = Math.cos(numero2);
                String resultado = Double.toString(result);
                text.setText(resultado);
            }else{
                numero2= (float) (numero2*Math.PI/180);
                double result= Math.cos(numero2);
                String resultado=Double.toString(result);
                text.setText(resultado);
            }

        }
    }
}