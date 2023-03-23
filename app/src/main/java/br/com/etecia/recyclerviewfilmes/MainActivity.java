package br.com.etecia.recyclerviewfilmes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Filmes> listaFilmes;

    //Declarar recyclerview
    RecyclerView idRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Apresentando o xml para o java
        idRecyclerView = findViewById(R.id.idListaFilmes);

        //criando a base de dados para carregamento da lista de filmes
        listaFilmes = new ArrayList<>();

        listaFilmes.add(
                new Filmes("Casamento Armado",
                        "Darcy (Jennifer Lopez) e Tom (Josh Duhamel) reúnem suas famílias para o casamento do destino final.",
                        "Comédia/Ação/Romance",
                        R.drawable.casamento));
        listaFilmes.add(
                new Filmes("A queda",
                        "Para os melhores amigos Becky e Hunter, a vida é sobre vencer medos e ultrapassar limites. ",
                        "Suspense",
                        R.drawable.queda));
        listaFilmes.add(
                new Filmes("Duro de Atuar",
                                "Kevin Hart - interpretando uma versão de si mesmo - está em uma missão que desafia a morte para se tornar uma estrela de ação. ",
                        "Comédia/Ação/Suspense",
                        R.drawable.duro));
        listaFilmes.add(
                new Filmes("Sayen",
                        "Nas florestas do sul do Chile, uma jovem mapuche, Sayen, sai em busca dos mercenários que assassinaram sua avó." ,
                        "Suspense",
                        R.drawable.sayen));
        listaFilmes.add(
                new Filmes("Coringa",
                        "\"Coringa\" gira em torno do icônico arqui-inimigo e é uma história original e independente nunca antes vista na tela grande. " ,
                        "Drama/Suspense",
                        R.drawable.coringa));
        listaFilmes.add(
                new Filmes("Triângulo da Tristeza",
                        "O casal modelo de celebridades, Carl e Yaya, são convidados para um cruzeiro de luxo para os super-ricos. ",
                        "Comédia/Drama",
                        R.drawable.triangulo));
        listaFilmes.add(
                new Filmes("Jogo de Amor e Ódio",
                        "Decidida a alcançar o sucesso profissional sem comprometer sua ética.",
                        "Comédia/Romance",
                        R.drawable.odio));
        listaFilmes.add(
                new Filmes("Casando a minha Ex",
                        "Mariana acredita que os casamentos são uma farsa, por isso se dedica a planejá-los. " ,
                        "Comédia/Romance",
                        R.drawable.casado));
        listaFilmes.add(
                new Filmes("Alguém que eu conhecia",
                        "Em uma viagem para sua cidade natal, a viciada em trabalho Ally (Alison Brie) relembra seu primeiro amor.",
                        "Comédia/Drama/Romance",
                        R.drawable.alguem));
        listaFilmes.add(
                new Filmes("Assasino sem rastro",
                        "Um assassino descobre que se tornou um alvo depois de se recusar a concluir um trabalho para uma perigosa organização criminosa. ",
                        "Ação/Suspense",
                        R.drawable.assasino));

        //criando a classe adaptadora e passando os parâmetros
        MyAdapter adapter = new MyAdapter(getApplicationContext(), listaFilmes);

        //Tipo de layout que a lista irá seguir

        idRecyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));

        //fixador de tamanho da lista - deixar mais rápida
        idRecyclerView.setHasFixedSize(true);

        //ligar o recyclerview ao adaptador
        idRecyclerView.setAdapter(adapter);
    }
}