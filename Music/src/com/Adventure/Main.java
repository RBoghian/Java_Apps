package com.Adventure;

import com.Adventure.model.Artist;
import com.Adventure.model.Datasource;

import javax.xml.crypto.Data;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Datasource datasource = new Datasource();
        if(!datasource.open()){
            System.out.println("Problema");
        }

        List<Artist > artists = datasource.queryArtists(5);
        if(artists==null){
            System.out.println("No artists!");
            return;
        }
        for(Artist artist : artists){
            System.out.println("ID= " + artist.getId() + ", Name = " + artist.getName());
        }
//        List<String > albumsForArtist = datasource.queryAlbumsForArtist("Iron Maiden", Datasource.ORDER_BY_ASC);
//        for(String album : albumsForArtist){
//            System.out.println(album);
//        }
        datasource.close();
    }
}
