/**
 * Created by lennyhicks on 4/25/17.
 */
class Nature {
    static class Attacker extends Stat {
        /**
         * @return returns !50% of the original attack due to being an Attacker
         */
        @Override
        public Integer getAttack() {
            return Math.round(super.getAttack() * 1.5f);
        }

        /**
         * @return returns 75% of the original defense due to being an Attacker
         */
        @Override
        public Integer getDefense() {
            return Math.round(super.getDefense() * 0.75f);
        }
    }

    static class Defender extends Stat {
        /**
         * @return returns 75% of the original attack due to being an Defender
         */
        @Override
        public Integer getAttack() {
            return Math.round(super.getAttack() * 0.75f);
        }

        /**
         * @return returns 150% of the original defense due to being an Defender
         */
        @Override
        public Integer getDefense() {
            return Math.round(super.getDefense() * 1.5f);
        }
    }
}
