package com.example.to_dolistproject.interfaces;

import com.example.to_dolistproject.data.NoteModel;

public interface OnItemClickListener {
    void onItemClick(NoteModel noteModel);

    void onItemPress(NoteModel noteModel);
}
