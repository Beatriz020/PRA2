package com.example.agendiario;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "museums")

public class Museum {
@PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "museumId")
    private int mId;

    @Nullable
    @ColumnInfo(name = "museumName")
    private String mName;

    private String mStyle;

    public Museum(@Nullable String name, String style, int score, String creationDate) {
        mName = name;
        mStyle = style;
        mScore = score;
        mCreationDate = creationDate;
    }

    public int getId() {
        return mId;
    }

    public void setId(int id) {
        mId = id;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getStyle() {
        return mStyle;
    }

    public void setStyle(String style) {
        mStyle = style;
    }

    public int getScore() {
        return mScore;
    }

    public void setScore(int score) {
        mScore = score;
    }

    public String getCreationDate() {
        return mCreationDate;
    }

    public void setCreationDate(String creationDate) {
        mCreationDate = creationDate;
    }

    private int mScore;
    private String mCreationDate;
    
}
