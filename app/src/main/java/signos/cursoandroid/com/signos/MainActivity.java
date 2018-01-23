package signos.cursoandroid.com.signos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listaSignos;
    private String [] signos = {
            "Áries", "Touro", "Gêmeos", "Câncer", "Leão", "Virgem", "Libra", "Escorpião", "Sagitário", "Capricórnio", "Aquário", "Peixes"
    };
    private String [] perfils = {
            "Áries :A Lua entra em Sagitário e, livre de pressão, indica um dia de expansão e crescimento em projetos pessoais e profissionais que começaram há alguns dias ou semanas. O momento pode envolver a decisão de marcar ou realizar uma viagem internacional ou mesmo começar um novo curso.",
            "Touro :A Lua entra em Sagitário e, livre de pressão, indica um dia de expansão e crescimento material e financeiro, especialmente se estiver envolvido com uma sociedade ou parcerias financeiras. O dia pode envolver um passo à frente em uma negociação ou empréstimo. Você estará mais aberto e sensível.",
            "Gêmeos :A Lua entra em Sagitário e, livre de pressão, indica um dia bastante positivo para os relacionamentos pessoais e profissionais. O momento pode envolver a chegada de uma proposta de sociedade ou parceria comercial. Você estará mais aberto, receptivo e mais voltado para as amizades.",
            "Câncer :A Lua entra em Sagitário e, livre de pressão, indica um dia de expansão e crescimento em projetos, especialmente de trabalho. Uma nova proposta de trabalho ou um convite para participar de um novo projeto pode surgir ainda hoje. O momento pode envolver também a decisão de cuidar com mais carinho da saúde.",
            "Leão :A Lua entra em Sagitário e, livre de pressão, indica um dia de movimento intenso na vida social e aproximação de amigos. O dia é ótimo para a realização de projetos criativos, mas também para estar junto de seus filhos, caso os tenha. Um romance pode começar a ser desenhado pelo Universo.",
            "Virgem :A Lua entra em Sagitário e, livre de pressão, indica um dia de interiorização e necessidade de estar mais perto dos seus. Você estará mais caseiro e mais voltado para as atividades que envolvem a melhora de sua casa, como o início de uma reforma ou mudança de decoração. Dia ótimo para leituras reflexivas.",
            "Libra :A Lua entra em Sagitário e, livre de pressão, indica um dia de boa comunicação que beneficia acordos e reuniões de negócios que podem envolver a negociação de um novo projeto ou contrato. O momento pode envolver a realização de uma viagem rápida e bastante agradável. Aproveite as boas energias deste dia.",
            "Escorpião :A Lua entra em Sagitário e, livre de pressão, indica um dia de expansão e crescimento em projetos que envolvem o aumento de seus rendimentos. O momento é bom para a organização de sua vida material e financeira. Planeje o equilíbrio de ganhos e gastos e siga à risca cada passo.",
            "SAgitário :A Lua entra em seu signo e, livre de pressão, indica um dia de expansão e crescimento, de abertura e amorosidade. Você estará mais voltado para as coisas que lhe dão prazer e para as pessoas que ama. Dia ótimo para cuidar dos filhos ou dos pais. Mas não esqueça de cuidar de si mesmo.",
            "Capricórnio :A Lua entra em Sagitário e, livre de pressão, indica um dia de interiorização e necessidade de distanciar-se da vida social e de conversas vazias. O momento pode envolver a decisão de começar a planejar um novo projeto, que será colocado em prática daqui alguns dias.",
            "Aquário :A Lua entra em Sagitário e, livre de pressão indica um dia de abertura e melhora na comunicação, de compromissos sociais e aproximação de amigos, novos e antigos. Você estará mais comunicativo e voltado para o seu coração. O momento pode envolver a chegada de uma pessoa especial à sua vida.",
            "Peixes :A Lua entra em Sagitário e, livre de pressão, indica um dia de expansão e crescimento em projetos profissionais e planos de negócios. O momento pode envolver a chegada de um novo projeto ou mesmo a decisão de um pedido de promoção. Você estará mais aberto e comunicativo no trabalho.",

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaSignos = (ListView) findViewById(R.id.listaSignosId);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                signos);

        listaSignos.setAdapter(adapter);

        listaSignos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int posicaoArray = i;
                Toast.makeText(MainActivity.this, perfils[i], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
