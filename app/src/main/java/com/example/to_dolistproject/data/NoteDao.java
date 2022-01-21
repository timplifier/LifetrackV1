package com.example.to_dolistproject.data;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface NoteDao {


    @Insert
    void insertAll(Note... notes);

    @Update
    void updateNotes(Note note);

    @Delete
    void delete(Note note);

    @Query("SELECT * FROM note_table ORDER BY id ASC")
    LiveData<List<Note>> getAllData();


}
