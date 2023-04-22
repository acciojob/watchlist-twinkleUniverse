package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {
    HashMap<String,Movie> movieMap=new HashMap<>();
    HashMap<String,Director> directorMap=new HashMap<>();
    HashMap<String, List<String>> pairMap=new HashMap<>();
    public void addMovie(Movie movie){
        movieMap.put(movie.getName(),movie);
    }
    public void addDirector(Director director){
        directorMap.put(director.getName(), director);
    }
    public void addMovieDirectorPair(String movieName,String directorName){
        if(directorMap.containsKey(directorName)){
            pairMap.get(directorName).add(movieName);
        }else{
            List<String>list=new ArrayList<>();
            list.add(movieName);
            pairMap.put(directorName,list);
        }
    }
    public Movie getMovieByName(String movieName){
            return movieMap.get(movieName);
    }
    public Director getDirectorByName(String directorName){
        return directorMap.get(directorName);
    }
    public List<String> getMoviesByDirectorName(String directorName){
        return pairMap.get(directorName);
    }

    public List<String>findAllMovies(){
        List<String>list=new ArrayList<>();
        for(String m:movieMap.keySet()){
            list.add(m);
        }
        return list;
    }
    public void deleteDirectorByName(String directorName){
        List<String>listMovies=pairMap.get(directorName);
        for(String m:listMovies){
            movieMap.remove(m);
        }
        directorMap.remove(directorName);
        pairMap.remove(directorName);
    }
     public void deleteAllDirectors(){
        for(String directorName: pairMap.keySet()){
            deleteDirectorByName(directorName);
        }
     }
}
