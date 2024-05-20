import java.util.*;

class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int extraHealth = bandage[0]; // 추가 체력 적용 간격
        int currentHealth = health; 
        int lastAttackTime = 0; 

        for (int[] attack : attacks) {
            int attackTime = attack[0];
            int damage = attack[1];

            if (currentHealth <= 0) {
                return -1; // 체력이 0 이하이면 캐릭터가 사망
            }

            int timeElapsed = attackTime - lastAttackTime - 1; // 공격 간격
            int extraHealTimes = timeElapsed / extraHealth; // 추가 체력 적용 횟수

            // 공격 직전까지의 체력 회복 
            currentHealth = Math.min(health, currentHealth + (timeElapsed * bandage[1])); 
            //최대 체력 넘지 않게 
            currentHealth = Math.min(health, currentHealth + (extraHealTimes * bandage[2]));
            //쿨타임 계산 

            currentHealth -= damage;

            lastAttackTime = attackTime;
        }
        return currentHealth <= 0 ? -1 : currentHealth;
    }
}
