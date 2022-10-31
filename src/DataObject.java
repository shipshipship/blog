import java.io.Serializable;

/**
 * @author WuShuai
 */
public class DataObject implements Serializable {
    private static int i=0;
    private static String word=" ";
    public void setWord(String word){
        DataObject.word=word;
    }
    public void setI(int i){
        DataObject.i=i;
    }
    public String getWord(){
        return this.word;
    }
    public int getI(){
        return i;
    }

}
