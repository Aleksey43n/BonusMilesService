public class BonusMilesService {
    public int calculate(int cost) {
        int a = 20;            // количество рублей для одной бонусной мили
        int bonus = cost / a;  // количество бонусных миль
        return bonus;
    }
}