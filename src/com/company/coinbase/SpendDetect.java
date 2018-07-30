package com.company.coinbase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dbiswas on 7/21/18.
 */

/*A group of friends go on a trip. Some people pay some transactions in full,
        which should be divided equally to all. At the end, how to settle everyone's debt.*/
public class SpendDetect
{

    public void getPayDetails(String payer, int amount, List<String> beneficiary) {

        List<String> consolidatedBenificiary = beneficiary;
        int dividableCount = consolidatedBenificiary.size();
        int amountToBePaid = 0;

        //Check if the payer is also a beneficiary
        boolean IfPayerIsBenificiary = checkIfPayerIsBenificiary(payer, beneficiary);

        /**
         * If the payer is beneficiary remove the payer from the list of
         * beneficiaries
         */

        if (IfPayerIsBenificiary) {

            consolidatedBenificiary.remove(payer);
        }

        /**
         * Calculate the amount to be payed back by the benificiary
         */

        amountToBePaid = amount / dividableCount;

        /**
         * List the details to be paid by the beneficiary to the payer
         */
        for (String benificiaryIndividual : beneficiary) {
            System.out.println(benificiaryIndividual + " should be paying "
                    + amountToBePaid + " to " + payer);
        }
    }

    /**
     * Method to check if the payer is a benificiary
     *
     * @param payer
     * @param beneficiary
     * @return
     */
    public boolean checkIfPayerIsBenificiary(String payer,
                                             List<String> beneficiary) {
        boolean IfPayerIsBenificiary = false;

        if (beneficiary.contains(payer)) {
            return true;
        }

        return IfPayerIsBenificiary;

    }


    public static void main(String[] args) {
        SpendDetect spd = new SpendDetect();
        List<String> benificiaryList = new ArrayList<String>();
        benificiaryList.add("A");
        benificiaryList.add("B");
        benificiaryList.add("C");
        benificiaryList.add("D");

        spd.getPayDetails("A", 100, benificiaryList);
        benificiaryList.clear();

        benificiaryList.add("B");
        benificiaryList.add("C");
        spd.getPayDetails("B", 40, benificiaryList);
        benificiaryList.clear();

        benificiaryList.add("C");
        benificiaryList.add("D");
        spd.getPayDetails("C", 20, benificiaryList);
        benificiaryList.clear();

        benificiaryList.add("A");
        benificiaryList.add("B");
        spd.getPayDetails("D", 50, benificiaryList);

    }
}
