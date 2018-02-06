package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Greeting {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String content;

//    public Greeting(long id, String content) {
//        this.id = id;
//        this.content = content;
//    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }
}
