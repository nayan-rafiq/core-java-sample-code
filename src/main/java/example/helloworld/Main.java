package example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        for(int i = 0; i < 1; i ++) {
            String[] arr = new String[]{
                    "query.dayCountOverHundredData.data", "getDaysBalanceOverHundred.data", "getFlaggingHistoryAPI.data", "query.totalTradingRevenue.data", "cancelledTransactionsPercent.data", "getTransactionDisputes.data", "query.childReferralsData.loading", "getLocationData.data", "query.loggedInDevicesData.loading", "getAstraCardDetails.data", "query.childReferralsData.data", "query.totalTradingRevenue", "getJ2JSent.data", "query.j2JReceivedData.data", "api.piiUpdateHistoryData", "query.p2pOutgoingData", "query.piiUpdateBeforeFirstTxnData.data", "query.positiveStrikeData.loading", "query.p2pIncomingData.loading", "query.currentLocationData.loading", "piiUpdateBeforeFirstTxn.data", "getPIIUpdateHistory.data", "query.loggedInDevicesData.data", "query.disputesInfoData", "query.j2JSentData", "query.j2JSentData.loading", "loggedInDevices.data", "query.positiveStrikeData.data", "lib.getAccountDetails", "query.transactionDisputesData.loading", "query.disputesInfoData.data", "query.loggedInDevicesData", "query.dayCountOverHundredData.loading", "query.disputesInfoData.loading", "getTotalTransactionVolume.data", "query.piiUpdateCountData.data", "showAlert", "query.totalVolumeTxnsData.data", "query.provisionalCreditData.loading", "query.ipHoppingUserData.data", "getCurrentLocation.data", "getChildReferrals.data", "query.locationData", "lib.getPersonalDetails", "query.p2pIncomingData", "query.childReferralsData", "query.negativeBalanceData", "query.piiUpdateCountData.loading", "query.currentLocationData.data", "query.positiveStrikeData", "query.astraCardDetails", "query.astraCardDetails.loading", "query.provisionalCreditData.data", "query.negativeBalanceData.loading", "query.ipHoppingUserData", "query.currentLocationData", "query.piiUpdateBeforeFirstTxnData.loading", "getJ2JReceived.data", "query.cancelledTransactionsPercentData", "query.j2JReceivedData", "query.cancelledTransactionsPercentData.loading", "query.j2JSentData.data", "getTotalTradingRevenue.data", "query.totalVolumeTxnsData", "api.flaggingHistoryData.data", "query.negativeBalanceData.data", "query.piiUpdateBeforeFirstTxnData", "negativeBalance.data", "piiUpdateCount.data", "query.p2pOutgoingData.data", "api.flaggingHistoryData.loading", "err", "api.piiUpdateHistoryData.loading", "query.piiUpdateCountData", "query.transactionDisputesData", "query.locationData.data", "query.astraCardDetails.data", "query.p2pOutgoingData.loading", "query.ipHoppingUserData.loading", "provisionalCredit.data", "p2pIncomingGreater1000.data", "query.dayCountOverHundredData.error", "query.totalVolumeTxnsData.loading", "query.totalTradingRevenue.loading", "query.dayCountOverHundredData", "query.provisionalCreditData", "query.p2pIncomingData.data", "ipHoppingUser.data", "disputesInfo.data", "query.cancelledTransactionsPercentData.data", "query.transactionDisputesData.data", "api.piiUpdateHistoryData.data", "p2pOutgoingGreater1000.data", "getPositiveStrike.data", "api.flaggingHistoryData",
                    null, null, null
            };


            Set<String> set = new HashSet<>();
            set.add(null);
            set.add("hello");
            set.add("hello");
            set.add(null);

            ArrayList<String> arrayList = new ArrayList<>(set);

            System.out.println("arr.length = " + arr.length);
            System.out.println("set.length = " + set.size());
            System.out.println("new ArrayList<>(set).length = " + arrayList.size());
            System.out.println("hasNull = " + arrayList.contains(null));
        }
    }
}
