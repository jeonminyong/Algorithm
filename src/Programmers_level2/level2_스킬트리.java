package Programmers_level2;

public class level2_스킬트리 {

    public static void main(String[] args) {


        String skill="CBD";
        String [] skill_trees ={"BACDE", "CBADF", "AECB", "BDA"};

        int answer = solution(skill,skill_trees);
        System.out.println("answer = " + answer);
    }

    private static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i=0; i<skill_trees.length; i++){
            String tmp = skill_trees[i];
            int arr[] = new int[skill.length()];
            for(int k=0; k<arr.length; k++){
                arr[k]=30; //초기값 셋팅
            }
            for(int j=0; j<skill.length(); j++){
                for(int h=0; h<tmp.length(); h++){
                    if(skill.charAt(j)==tmp.charAt(h)){
                            arr[j]=h;
                    }
                }
            }
            boolean chk= true;

            for(int a=0; a<arr.length-1; a++){
                if(arr[a]>arr[a+1]){
                    chk=false;
                    break;
                }
            }

            if(chk){
                answer++;
            }
        }

    return answer;



    }

}
