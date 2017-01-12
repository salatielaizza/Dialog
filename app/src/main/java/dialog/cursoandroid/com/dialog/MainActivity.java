package dialog.cursoandroid.com.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = (Button) findViewById(R.id.botaoID);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Criar alert Dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //configurar o título
                dialog.setTitle("E ai manolo!!!??");

                //configura a mensagem
                dialog.setMessage("Tu vais desenrolar esse APP ou tá difícil?");

                //Não deixa o dialog ser clicado fora e voltar na activity
                dialog.setCancelable(false);

                //Adicionar ícono no dialog
                dialog.setIcon(android.R.drawable.ic_menu_help);

                //Botão Negativo NÃO
                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão Não pressionado", Toast.LENGTH_SHORT).show();
                            }
                        }
                );

                //Botão Positivo SIM
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "Botão Sim pressionado", Toast.LENGTH_SHORT).show();
                            }
                        }
                );
                dialog.create();
                dialog.show();
            }
        });
    }
}