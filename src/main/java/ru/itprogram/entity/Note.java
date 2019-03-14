package ru.itprogram.entity;

import java.util.Date;
import java.util.Objects;

public class Note {
    private String text;
    private Date recordDate;

    public Note(String text, Date recordDate) {
        this.text = text;
        this.recordDate = recordDate;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(text, note.text) &&
                Objects.equals(recordDate, note.recordDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, recordDate);
    }

    @Override
    public String toString() {
        return "Note{" +
                "text='" + text + '\'' +
                ", recordDate=" + recordDate +
                '}';
    }
}
