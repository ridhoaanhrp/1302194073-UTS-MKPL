package lib;

import java.util.List;
import java.util.LinkedList;

public class Family {
    private String spouseName;
	private String spouseIdNumber;
    private List<String> childNames;
	private List<String> childIdNumbers;

    public Family(String spouseName, String spouseIdNumber, List<String> childNames, List<String> childIdNumbers){
        this.spouseName = spouseName;
        this.spouseIdNumber = spouseIdNumber;

        childNames = new LinkedList<String>();
		childIdNumbers = new LinkedList<String>();
    }

    public void setSpouseName(String spouseName){
        this.spouseName = spouseName;
    }
    public void setSpouseNumber(String spouseIdNumber){
        this.spouseIdNumber = spouseIdNumber;
    }


    public void addChild(String childName, String childIdNumber){
        childNames.add(childName);
        childIdNumbers.add(childIdNumber);
    }

    public String getSpouseName(){
        return spouseName;
    }
    public String getSpouseNumber(){
        return spouseIdNumber;
    }

    public List<String> getChildIdNumber(){
        return childIdNumbers;
    }
    


}
