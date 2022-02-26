package com.company.Collection;

import org.jetbrains.annotations.NotNull;

public class Books implements Comparable<Books> {

    private int id;
    private String title;

    public Books (int id, String title){
        this.id = id;
        this.title = title;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return (this.id);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj.getClass() == this.getClass()){
            return (this.id == ((Books) obj).id);
//                    &&(this.getTitle().equals(((Books) obj).getTitle()));//here id and tittle together makes a primary key

        }
        else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}'+"\n";
    }

    @Override
    public int compareTo(@NotNull Books that) {

            if (this.getId()== that.getId()){
                return 0;
            }
            if (this.getId()> that.getId()){
                return 1;
            }
            else {
                return -1;
            }



    }
}
