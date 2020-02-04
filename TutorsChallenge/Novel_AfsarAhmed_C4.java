
/**
 * Write a description of class TutorsChallenge4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Novel_AfsarAhmed_C4
{
    String _author;
    String _title;
    int _editionNumber;
    double _price;

    public Novel_AfsarAhmed_C4(){//constructor
        _author="Unknwon";
        _title="Unknwon";
        _editionNumber=0;
        _price=0.0;
        
    }
    
    public void displayInfo(){
        System.out.print(_title + "\t" + _author + "\t$" + _price);
        
    }
}
