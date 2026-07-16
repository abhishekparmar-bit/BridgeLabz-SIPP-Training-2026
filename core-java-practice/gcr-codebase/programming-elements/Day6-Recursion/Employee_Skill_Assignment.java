public class Employee_Skill_Assignment {

    static void findTeams(int[] skills, int target,
                          int index, String team, int sum) {

        if (sum == target) {
            System.out.println("[" + team + "]");
            return;
        }

        if (index == skills.length || sum > target) {
            return;
        }

        // Include current employee
        findTeams(skills,
                  target,
                  index + 1,
                  team.isEmpty() ? String.valueOf(skills[index])
                                 : team + "," + skills[index],
                  sum + skills[index]);

        // Exclude current employee
        findTeams(skills,
                  target,
                  index + 1,
                  team,
                  sum);
    }

    public static void main(String[] args) {
        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, target, 0, "", 0);
    }
}