package smallest_sufficient_team;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// In a project, you have a list of required skills req_skills, and a list of people.
// The ith person people[i] contains a list of skills that the person has.

// Consider a sufficient team: a set of people such that for every required skill in req_skills,
//  there is at least one person in the team who has that skill.
//  We can represent these teams by the index of each person.

// For example, team = [0, 1, 3] represents the people with skills people[0], people[1], and people[3].
// Return any sufficient team of the smallest possible size, represented by the index of each person.
// You may return the answer in any order.

// It is guaranteed an answer exists.

public class Solution {
    public int[] smallestSufficientTeam(String[] req_skills, List<List<String>> people) {
//        add people to list until all skills are satisfied
//        keep track of number of people and skip to next set if more than minimum
//        Loop through list of people in circular fashion until all have been added to a list
        int numPeople = people.size();
        int minPeople = numPeople;
        int[] minSet;
        List<Integer> minList = null;


        for(int i = 0; i < people.size(); i++) {
//            Add current person's skills to current set
            List<Integer> currentList = new ArrayList<>();
            currentList.add(i);

            Set<String> skills = new HashSet<>();
            for(String s : people.get(i)) {
                skills.add(s);
            }

            int j = i = 1;
            while(i != j) {
                if(j == numPeople) {
                    j = 0;
                }
//                add next person to set if a new skill is added

                Boolean skillAdded = false;
                for(String s : people.get(j)) {
                    if(!skills.contains(s)) {
                        skills.add(s);
                        skillAdded = true;
                    }
                }

                if(skillAdded) {
                    currentList.add(j);
                }

                if(skills.size() == req_skills.length) {
//                    required skills satisfied
                    break;
                }
            }

//            Compare current size of set to minimum
            if(minPeople > currentList.size()) {
//                Update minimum set of people
                minPeople = currentList.size();
                minList = currentList;
            }
        }

        minSet = new int[minPeople];
        for(int i = 0; i < minPeople; i++) {
            minSet[i] = minList.get(i);
        }

        return minSet;
    }
}
