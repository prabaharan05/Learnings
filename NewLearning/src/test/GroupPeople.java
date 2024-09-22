package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] groupSizes= {};
        List<List<Integer>> groupList=new ArrayList<>();
        Map<Integer,List<Integer>> groupsMap=new HashMap<>();
   for(int i=0;i<groupSizes.length;i++){
        if(!groupsMap.containsKey(groupSizes[i])){
            groupsMap.put(groupSizes[i],new ArrayList<Integer>());
        }

        List<Integer> group=groupsMap.get(groupSizes[i]);
        group.add(i);

        if(group.size()==groupSizes[i]){
            groupList.add(group);
            groupsMap.remove(groupSizes[i]);
        }

    }

		  //  return groups;
		        
		    
		
	}

}
