package id.smkcoding.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Movie> movieList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle("Movie List");
        }

        recyclerView = findViewById(R.id.mainRecycler);

        movieList = new ArrayList<>();
        movieList.add(new Movie(R.drawable.annabelle, "Annabelle", "John Form (Ward Horton) thinks he's found the perfect gift for his expectant wife, Mia (Annabelle Wallis) : a vintage doll in a beautiful white dress. However, the couple's delight doesn't last long: One terrible night, devil worshippers invade their home and launch a violent attack against the couple. When the cultists try to summon a demon, they smear a bloody rune on the nursery wall and drip blood on Mia's doll, thereby turning the former object of beauty into a conduit for ultimate evil."));
        movieList.add(new Movie(R.drawable.greatestshowman, "The Greatest Showman", "Orphaned, penniless but ambitious and with a mind crammed with imagination and fresh ideas, the American Phineas Taylor Barnum will always be remembered as the man with the gift to effortlessly blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor will manage to open a wax museum but will soon shift focus to the unique and peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Some will call Barnum's wide collection of oddities, a freak show; however, when the obsessed showman gambles everything on the opera singer Jenny Lind to appeal to a high-brow audience, he will somehow lose sight of the most important aspect of his life: his family. Will Barnum risk it all to be accepted?"));
        movieList.add(new Movie(R.drawable.venom, "Venom", "Venom is an upcoming American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[2] and distributed by Sony Pictures Releasing. It is intended to be the first film in Sony's Marvel Universe, adjunct to the Marvel Cinematic Universe (MCU).[a] The film is directed by Ruben Fleischer from a screenplay by Scott Rosenberg and Jeff Pinkner, Kelly Marcel, and Will Beall, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock is bound to an alien symbiote that gives him superpowers."));
        movieList.add(new Movie(R.drawable.annabelle, "Annabelle", "John Form (Ward Horton) thinks he's found the perfect gift for his expectant wife, Mia (Annabelle Wallis) : a vintage doll in a beautiful white dress. However, the couple's delight doesn't last long: One terrible night, devil worshippers invade their home and launch a violent attack against the couple. When the cultists try to summon a demon, they smear a bloody rune on the nursery wall and drip blood on Mia's doll, thereby turning the former object of beauty into a conduit for ultimate evil."));
        movieList.add(new Movie(R.drawable.greatestshowman, "The Greatest Showman", "Orphaned, penniless but ambitious and with a mind crammed with imagination and fresh ideas, the American Phineas Taylor Barnum will always be remembered as the man with the gift to effortlessly blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor will manage to open a wax museum but will soon shift focus to the unique and peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Some will call Barnum's wide collection of oddities, a freak show; however, when the obsessed showman gambles everything on the opera singer Jenny Lind to appeal to a high-brow audience, he will somehow lose sight of the most important aspect of his life: his family. Will Barnum risk it all to be accepted?"));
        movieList.add(new Movie(R.drawable.venom, "Venom", "Venom is an upcoming American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[2] and distributed by Sony Pictures Releasing. It is intended to be the first film in Sony's Marvel Universe, adjunct to the Marvel Cinematic Universe (MCU).[a] The film is directed by Ruben Fleischer from a screenplay by Scott Rosenberg and Jeff Pinkner, Kelly Marcel, and Will Beall, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock is bound to an alien symbiote that gives him superpowers."));
        movieList.add(new Movie(R.drawable.annabelle, "Annabelle", "John Form (Ward Horton) thinks he's found the perfect gift for his expectant wife, Mia (Annabelle Wallis) : a vintage doll in a beautiful white dress. However, the couple's delight doesn't last long: One terrible night, devil worshippers invade their home and launch a violent attack against the couple. When the cultists try to summon a demon, they smear a bloody rune on the nursery wall and drip blood on Mia's doll, thereby turning the former object of beauty into a conduit for ultimate evil."));
        movieList.add(new Movie(R.drawable.greatestshowman, "The Greatest Showman", "Orphaned, penniless but ambitious and with a mind crammed with imagination and fresh ideas, the American Phineas Taylor Barnum will always be remembered as the man with the gift to effortlessly blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor will manage to open a wax museum but will soon shift focus to the unique and peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Some will call Barnum's wide collection of oddities, a freak show; however, when the obsessed showman gambles everything on the opera singer Jenny Lind to appeal to a high-brow audience, he will somehow lose sight of the most important aspect of his life: his family. Will Barnum risk it all to be accepted?"));
        movieList.add(new Movie(R.drawable.venom, "Venom", "Venom is an upcoming American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[2] and distributed by Sony Pictures Releasing. It is intended to be the first film in Sony's Marvel Universe, adjunct to the Marvel Cinematic Universe (MCU).[a] The film is directed by Ruben Fleischer from a screenplay by Scott Rosenberg and Jeff Pinkner, Kelly Marcel, and Will Beall, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock is bound to an alien symbiote that gives him superpowers."));
        movieList.add(new Movie(R.drawable.annabelle, "Annabelle", "John Form (Ward Horton) thinks he's found the perfect gift for his expectant wife, Mia (Annabelle Wallis) : a vintage doll in a beautiful white dress. However, the couple's delight doesn't last long: One terrible night, devil worshippers invade their home and launch a violent attack against the couple. When the cultists try to summon a demon, they smear a bloody rune on the nursery wall and drip blood on Mia's doll, thereby turning the former object of beauty into a conduit for ultimate evil."));
        movieList.add(new Movie(R.drawable.greatestshowman, "The Greatest Showman", "Orphaned, penniless but ambitious and with a mind crammed with imagination and fresh ideas, the American Phineas Taylor Barnum will always be remembered as the man with the gift to effortlessly blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor will manage to open a wax museum but will soon shift focus to the unique and peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Some will call Barnum's wide collection of oddities, a freak show; however, when the obsessed showman gambles everything on the opera singer Jenny Lind to appeal to a high-brow audience, he will somehow lose sight of the most important aspect of his life: his family. Will Barnum risk it all to be accepted?"));
        movieList.add(new Movie(R.drawable.venom, "Venom", "Venom is an upcoming American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[2] and distributed by Sony Pictures Releasing. It is intended to be the first film in Sony's Marvel Universe, adjunct to the Marvel Cinematic Universe (MCU).[a] The film is directed by Ruben Fleischer from a screenplay by Scott Rosenberg and Jeff Pinkner, Kelly Marcel, and Will Beall, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock is bound to an alien symbiote that gives him superpowers."));
        movieList.add(new Movie(R.drawable.annabelle, "Annabelle", "John Form (Ward Horton) thinks he's found the perfect gift for his expectant wife, Mia (Annabelle Wallis) : a vintage doll in a beautiful white dress. However, the couple's delight doesn't last long: One terrible night, devil worshippers invade their home and launch a violent attack against the couple. When the cultists try to summon a demon, they smear a bloody rune on the nursery wall and drip blood on Mia's doll, thereby turning the former object of beauty into a conduit for ultimate evil."));
        movieList.add(new Movie(R.drawable.greatestshowman, "The Greatest Showman", "Orphaned, penniless but ambitious and with a mind crammed with imagination and fresh ideas, the American Phineas Taylor Barnum will always be remembered as the man with the gift to effortlessly blur the line between reality and fiction. Thirsty for innovation and hungry for success, the son of a tailor will manage to open a wax museum but will soon shift focus to the unique and peculiar, introducing extraordinary, never-seen-before live acts on the circus stage. Some will call Barnum's wide collection of oddities, a freak show; however, when the obsessed showman gambles everything on the opera singer Jenny Lind to appeal to a high-brow audience, he will somehow lose sight of the most important aspect of his life: his family. Will Barnum risk it all to be accepted?"));
        movieList.add(new Movie(R.drawable.venom, "Venom", "Venom is an upcoming American superhero film based on the Marvel Comics character of the same name, produced by Columbia Pictures in association with Marvel[2] and distributed by Sony Pictures Releasing. It is intended to be the first film in Sony's Marvel Universe, adjunct to the Marvel Cinematic Universe (MCU).[a] The film is directed by Ruben Fleischer from a screenplay by Scott Rosenberg and Jeff Pinkner, Kelly Marcel, and Will Beall, and stars Tom Hardy as Eddie Brock / Venom, alongside Michelle Williams, Riz Ahmed, Scott Haze, and Reid Scott. In Venom, journalist Brock is bound to an alien symbiote that gives him superpowers."));


        MovieAdapter movieAdapter = new MovieAdapter(MainActivity.this, movieList, new MovieAdapter.SetEvents() {
            @Override
            public void onItemClick(Movie movie) {
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("movie", movie);
                startActivity(intent);
            }
        });

        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(movieAdapter);
    }
}
