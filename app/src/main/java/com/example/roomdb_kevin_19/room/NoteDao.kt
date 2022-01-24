package com.example.roomdb_kevin_19.room

import androidx.room.*

@Dao
interface NoteDao {

    @Insert
    suspend fun addnote(note: Note)

    @Update
    suspend fun updatenote(note: Note)

    @Delete
    suspend fun deletenote(note: Note)

    @Query("SELECT * FROM note")
    suspend fun getNotes(): List<Note>

    @Query("SELECT * FROM note WHERE id=:note_id")
    suspend fun getNote(note_id: Int): List<Note>
}