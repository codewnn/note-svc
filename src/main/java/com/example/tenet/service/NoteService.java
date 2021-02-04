package com.example.tenet.service;

import com.example.tenet.dao.NoteDao;
import com.example.tenet.entity.NoteEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NoteService {

    @Autowired private NoteDao noteDao;
    public String insertNote(NoteEntity noteEntity){
        noteDao.insert(noteEntity);
        return "a";
    }

    public ArrayList<NoteEntity> selectNote(){
//        noteDao.select();
        return noteDao.select();
    }

}
