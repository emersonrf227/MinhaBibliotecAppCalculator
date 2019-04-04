package br.com.emerson.minhabibliotecapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import br.com.emerson.mylibraryall.CustomToast
import com.example.logonrmlocal.minhabiblioteca.Calculadora


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calculadora = Calculadora()
        val resultado = calculadora.somar(1,2)


       var toast = CustomToast()
        toast.showToast(this, "Palmeiras não tem Mundial")




       // Toast.makeText(this, resultado.toString(),
        //Toast.LENGTH_LONG).show()



    }



}
