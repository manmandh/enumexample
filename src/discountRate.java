import jdk.internal.icu.lang.UCharacterDirection;
interface DiscountRate {
        static double serviceDiscountPremium = 0.2;
        static double serviceDiscountGold = 0.15;
        static double serviceDiscountSilver = 0.1;
        static double productDiscountPremium = 0.1;
        static double productDiscountGold = 0.1;
        static double productDiscountSilver = 0.1;
        static double serviceDiscountRate(String type){
          return 0;
       }
        static double productDiscountRate(String type){
          return 0;
       }

        static double getServiceDiscountRate() {
            return 0;
        }
}
public class discountRate {
        private static final double serviceDiscountPremium = 0.2;
        private static final double serviceDiscountGold = 0.15;
        private static final double serviceDiscountSilver = 0.1;
        private static final double productDiscountPremium = 0.1;
        private static final double productDiscountGold = 0.1;
        private static final double productDiscountSilver = 0.1;

        protected static double getServiceDiscountRate() {
                return 0;
        }

        public  static double getServiceDiscountRate(String type, UCharacterDirection memberType){
                double discount =0;
                if(memberType.toString().equals("GOLD")){
                        discount += productDiscountGold;

                }
                return discount;
        }

        public double getProductDiscountRate(String type){
                return 0;
        }
}
