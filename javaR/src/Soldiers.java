public class Soldiers {
        private char soldier1;
        private char soldier2;
        private char soldier3;
        private String weapon;

        public Soldiers(char soldier1, char soldier2, char soldier3, String weapon) {
            this.soldier1 = soldier1;
            this.soldier2 = soldier2;
            this.soldier3 = soldier3;
            this.weapon = weapon;
        }

        public char getSoldier1() {
            return soldier1;
        }

        public void setSoldier1(char soldier1) {
            this.soldier1 = soldier1;
        }

        public char getSoldier2() {
            return soldier2;
        }

        public void setSoldier2(char soldier2) {
            this.soldier2 = soldier2;
        }

        public char getSoldier3() {
            return soldier3;
        }

        public void setSoldier3(char soldier3) {
            this.soldier3 = soldier3;
        }

        public String getWeapon() {
            return weapon;
        }

        public void setWeapon(String weapon) {
            this.weapon = weapon;
        }
    }

    class Attack {
        private Soldiers soldiers;

        public Attack(Soldiers soldiers) {
            this.soldiers = soldiers;
        }

        public String inviteSoldiers() {
            if (soldiers.getSoldier1() == soldiers.getSoldier2() ||
                    soldiers.getSoldier1() == soldiers.getSoldier3() ||
                    soldiers.getSoldier2() == soldiers.getSoldier3()) {
                return "Wrong Weapon";
            }

            if (soldiers.getWeapon().length() < 5) {
                return "Need more weapon";
            }

            return "Soldiers ready";
        }
    }
     class test {
         public static void main(String[] args) {
             Soldiers m = new Soldiers('k', 'l', 'm', "kklloopp");
             Attack a1 = new Attack(m);
             System.out.println(a1.inviteSoldiers());  // Should print "Soldiers ready"
         }
     }

