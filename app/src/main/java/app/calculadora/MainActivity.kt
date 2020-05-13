package app.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalculate: Button = findViewById(R.id.calculate)
        btnCalculate.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        var editTextValorUm: EditText = findViewById(R.id.primeiroValor)
        var editTextValorDois: EditText = findViewById(R.id.segundoValor)

        var valorUm = editTextValorUm.getText().toString()
        var valorDois = editTextValorDois.getText().toString()
        var Result = valorUm.toInt() + valorDois.toInt()

        var viewResult: TextView = findViewById(R.id.viewResult)
        viewResult.text = Result.toString()
    }
}
