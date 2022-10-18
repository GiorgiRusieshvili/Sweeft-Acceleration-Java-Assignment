package assignment_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//custom data structure with add and remove operations in O(1) time.
class CustomDataStructure {

    HashMap<Integer , HashSet<Integer>> dataMap;
    ArrayList<Integer> dataList;

    //constructor
    public CustomDataStructure() {
        dataList = new ArrayList<>();
        dataMap = new HashMap<>();
    }

    //method adds element to the collection and print message
    public void add(int addValue) {
        dataList.add(addValue);
            HashSet<Integer> set = new HashSet<>();
            set.add(dataList.size()-1);
            dataMap.put(addValue , set);
            System.out.println("Value "+addValue+" is added");
        }


    //method removes element from the collection if it exists
    // and prints the message
    public void remove(int removeValue) {
        if(dataMap.containsKey(removeValue)){

            int vidx = dataMap.get(removeValue).iterator().next();
            int lidx = dataList.size()-1;
            int lval = dataList.get(lidx);

            dataList.set(lidx , removeValue);
            dataList.set(vidx, lval);

            dataList.remove(lidx);
            dataMap.get(removeValue).remove(vidx);

            if(dataMap.get(removeValue).size()==0){
                dataMap.remove(removeValue);

            }

            if(dataMap.containsKey(lval)){
                dataMap.get(lval).remove(lidx);
                dataMap.get(lval).add(vidx);
            }
            System.out.println("Value "+removeValue+" is removed");

        }else{

            System.out.println("Value "+removeValue+" doesnt exists");
        }
    }

}



