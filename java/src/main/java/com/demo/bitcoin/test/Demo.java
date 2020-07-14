package com.demo.bitcoin.test;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.map.HashedMap;
import org.bitcoinj.core.Address;
import org.bitcoinj.core.DumpedPrivateKey;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;

import java.util.Date;
import java.util.Map;


public class Demo {


    public static void main(String[] args) throws Exception {


//       String a = Sha256.getSHA256(Sha256.getSHA256(""));
//       System.out.println(a);
//
//        Map<String, String> map = createAddress();
////        // 请妥善保存私钥和地址，后续操作都需要
//        System.out.println("地址："+map.get("fromAddr"));
//        System.out.println("私钥："+map.get("privateKey"));
////        地址：1FLc1UYjWER9gSHwCsvaAi2TUZQhfiuAst
////        私钥：L4zteFp6S5wb7sQkNJyDcVwCUVQNRKq3FySPyGszWw1ppq9vsLHF

//        // put请求
//        String putMethod = "/api/put";
//        String putUserAdds = "1DEPkC79Mr8QRa1w7NJxqA7RUP6VnHWHwB";                                                // dapp自身用户地址
//        String putDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";                                                // dapp地址,用于扣费
//        String putMetadata = "0101"; // 协议
//        String putData = "0101010101"; //上传内容转16进制数据
//        String putTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder putSign = new StringBuilder();
//        putSign.append(putMethod).append(putUserAdds).append(putDappAdds).append(putMetadata).append(putData).append(putTimestamp);
//        String hash = Sha256.getSHA256(putSign.toString());
//        String putSignature = signMsg(hash, "L4WAm7aJxmSDGhxgpWMjbm8NvgETae8S1d6L8P9gSpo6EF7nYhFm"); // 签名，把参数内容拼接，然后sha256， 再传入自己保存的私钥
//        JSONObject resultPutInfo = requestPut(putUserAdds, putDappAdds, putMetadata, putData, putTimestamp, putSignature);
//        System.out.println(resultPutInfo.toJSONString());
//
//         update请求
//        String updateMethod = "/api/update";
//        String updateUserAdds = "1DEPkC79Mr8QRa1w7NJxqA7RUP6VnHWHwB";
//        String updateDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL"; // 刚刚生成的地址
//        String updateMetadata = "0101"; // 协议
//        String updateData = "010101010101"; //上传内容转16进制数据
//        String updateDirveId = "89bf4e01465d56bb6fdf45f2ffb2d033631b5ba292bcf0f61d24c36387942913";
//        String updateTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder updateSign = new StringBuilder();
//        updateSign.append(updateMethod).append(updateUserAdds).append(updateDappAdds).append(updateMetadata).append(updateData).append(updateDirveId).append(updateTimestamp);
//        String updateSignature = signMsg(Sha256.getSHA256(updateSign.toString()), "L4WAm7aJxmSDGhxgpWMjbm8NvgETae8S1d6L8P9gSpo6EF7nYhFm"); // 签名，把参数内容拼接，然后sha256， 再传入自己保存的私钥
//        JSONObject resultUpdateInfo = requestUpdate(updateUserAdds, updateDappAdds, updateMetadata, updateData, updateDirveId, updateTimestamp, updateSignature);
//        System.out.println(resultUpdateInfo.toJSONString());
//
//
//        // 查询余额
//        String balanceMethod = "/api/get_balance";
//        String balanceDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
//        String balanceTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder balanceSign = new StringBuilder();
//        balanceSign.append(balanceMethod).append(balanceDappAdds).append(balanceTimestamp);
//        String balanceSignature = signMsg(Sha256.getSHA256(balanceSign.toString()), "KzGmcC2Fa48NHmad6SEst4Q1J9mHd95aFxzEuNrT94CEb6qrZAV6");
//        JSONObject resultBalance = requestBalance(balanceDappAdds, balanceTimestamp, balanceSignature);
//        System.out.println(resultBalance.toJSONString());
//
//        // 查询历史记录
//        String histroryMethod = "/api/get_tx_history";
//        String histroryDappAdds = "1Nd3WFphEJMuzB3Ecb6thTpBDP5iCppaQT";
//        String histroryTimestamp = new Date().getTime() + "";  // 时间戳
//        Integer page = 1;
//        StringBuilder histrorySign = new StringBuilder();
//        histrorySign.append(histroryMethod).append(histroryDappAdds).append(page).append(histroryTimestamp);
//        String histrorySignature = signMsg(Sha256.getSHA256(histrorySign.toString()), "KxbMxgosz2PsPWBpRJoacMng1njsNPJL5SjhXsCdzBjARy7FMp15");
//        JSONObject resultHistory = requestGetTxHistory(histroryDappAdds, page, histroryTimestamp, histrorySignature);
//        System.out.println(resultHistory.toJSONString());
//
//
//        // 查询driveid列表
//        String dirveListMethod = "/api/list_drive_id";
//        String driveListUserAdds = "1DEPkC79Mr8QRa1w7NJxqA7RUP6VnHWHwB";
//        String driveListDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
//        String driveListTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder driveListSign = new StringBuilder();
//        driveListSign.append(dirveListMethod).append(driveListUserAdds).append(driveListDappAdds).append(driveListTimestamp);
//        String driveListSignature = signMsg(Sha256.getSHA256(driveListSign.toString()), "KzGmcC2Fa48NHmad6SEst4Q1J9mHd95aFxzEuNrT94CEb6qrZAV6");
//        JSONObject driveList = requestListDriveId(driveListUserAdds, driveListDappAdds, driveListTimestamp, driveListSignature);
//        System.out.println(driveList);
//
//
//        // 查询指定driveId下的数据
//        String driveIdMethod = "/api/get";
//        String driveIdDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
//        String getdrive_id = "89bf4e01465d56bb6fdf45f2ffb2d033631b5ba292bcf0f61d24c36387942913";
//        String driveIdTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder driveIdSign = new StringBuilder();
//        driveIdSign.append(driveIdMethod).append(driveIdDappAdds).append(getdrive_id).append(driveIdTimestamp);
//        String sha256 = Sha256.getSHA256(driveIdSign.toString());
//        String driveIdSignature = signMsg(sha256, "KzGmcC2Fa48NHmad6SEst4Q1J9mHd95aFxzEuNrT94CEb6qrZAV6");
////        System.out.println(driveIdSign.toString());
////        System.out.println(sha256);
////        System.out.println(driveIdSignature);
//        JSONObject getDriveId = requestGetDriveid(driveIdDappAdds, getdrive_id, driveIdTimestamp, driveIdSignature);
//        System.out.println(getDriveId);

        // 查询指定updateId下的数据
//        String updateIdMethod = "/api/get";
//        String updateIdDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
//        String getupdate_id = "af639221bfb9890781ba3e4a870d296019ce054151db9f70177f5bbfd9627123";
//        String updateIdTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder updateIdSign = new StringBuilder();
//        updateIdSign.append(updateIdMethod).append(updateIdDappAdds).append(getupdate_id).append(updateIdTimestamp);
//        String updateIdSignature = signMsg(Sha256.getSHA256(updateIdSign.toString()), "KzGmcC2Fa48NHmad6SEst4Q1J9mHd95aFxzEuNrT94CEb6qrZAV6");
//        JSONObject getUpdateId = requestGetUpdateid(updateIdDappAdds, getupdate_id, updateIdTimestamp, updateIdSignature);
//        System.out.println(getUpdateId);

        // 根据协议查询所有的
//        String listAllMethod = "/api/list_all_drive_id";
//        String protocol = "FOCP1V5";
//        String listAllDappAdds = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
//        Integer listPage = 2;
//        Integer detail = 0;
//        String listAllTimestamp = new Date().getTime() + "";  // 时间戳
//        StringBuilder listAllSign = new StringBuilder();
//        listAllSign.append(listAllMethod).append(protocol).append(listAllDappAdds).append(listPage).append(detail).append(listAllTimestamp);
//        String listAllSignature = signMsg(Sha256.getSHA256(listAllSign.toString()), "KzGmcC2Fa48NHmad6SEst4Q1J9mHd95aFxzEuNrT94CEb6qrZAV6");
//        JSONObject listAll = requestListAllDriveId(protocol, listAllDappAdds, listPage, detail, listAllTimestamp, listAllSignature);
//        System.out.println(listAll);

//        terminate_drive_id
        String terminateMethod = "/api/set_auth";
        String useraddr = "1DEPkC79Mr8QRa1w7NJxqA7RUP6VnHWHwB";
        String dappaddr = "1FYxtYYKme9EjuZMsWVesJxrP75fAHo2jL";
        String drive_id = "215c8a296525490c73aa163d83ead8ac2b2459658e80dc67f1364179e7177454";
        String[] admins = {"0"};                        // 传0
        String[] members = {"0"};                       // 传0
        String timestamp = new Date().getTime() + "";
        StringBuffer sb = new StringBuffer();
        sb.append(terminateMethod).append(useraddr).append(dappaddr).append(drive_id).append(admins[0]).append(members[0]).append(timestamp);
        System.out.println(sb.toString());
        String signature = signMsg(Sha256.getSHA256(sb.toString()),"L4WAm7aJxmSDGhxgpWMjbm8NvgETae8S1d6L8P9gSpo6EF7nYhFm");
        JSONObject terminate = requestTerminateDriveId(useraddr, dappaddr, drive_id, admins, members, timestamp, signature);
        System.out.println(terminate);



    }

    /**
     * 创建地址，私钥
     */
    public static Map<String, String> createAddress() {

        Map map = new HashedMap();
        NetworkParameters params = MainNetParams.get();
        ECKey key = new ECKey();
        String fromAddr = new Address(params, key.getPubKeyHash()).toBase58();
        String privateKey = key.getPrivateKeyEncoded(params).toBase58();
        map.put("fromAddr", fromAddr);
        map.put("privateKey", privateKey);
        return map;

    }

    public static JSONObject requestPut(String useraddr, String dappaddr, String metadata, String data, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("user_addr", useraddr);
        param.put("dapp_addr", dappaddr);
        param.put("metadata", metadata);
        param.put("data", data);
        param.put("timestamp", timestamp);
        param.put("user_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/put", param.toJSONString()));
        return result;

    }

    public static JSONObject requestUpdate(String useraddr, String dappaddr, String metadata, String data, String drive_id, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("user_addr", useraddr);
        param.put("dapp_addr", dappaddr);
        param.put("metadata", metadata);
        param.put("data", data);
        param.put("drive_id", drive_id);
        param.put("timestamp", timestamp);
        param.put("user_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/update", param.toJSONString()));
        return result;

    }

    public static JSONObject requestGetDriveid(String dapp_addr, String drive_id, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("dapp_addr", dapp_addr);
        param.put("drive_id", drive_id);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/get", param.toJSONString()));
        return result;

    }

    public static JSONObject requestGetUpdateid(String dapp_addr, String update_id, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("dapp_addr", dapp_addr);
        param.put("update_id", update_id);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/get", param.toJSONString()));
        return result;

    }

    public static JSONObject requestListDriveId(String user_addr, String dapp_addr, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("user_addr", user_addr);
        param.put("dapp_addr", dapp_addr);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/list_drive_id", param.toJSONString()));
        return result;

    }

    public static JSONObject requestBalance(String dapp_addr, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("dapp_addr", dapp_addr);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/get_balance", param.toJSONString()));
        return result;

    }

//    http://freedrive.cash:8880

    public static JSONObject requestGetTxHistory(String dapp_addr, Integer page, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("dapp_addr", dapp_addr);
        param.put("page", page);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/get_tx_history", param.toJSONString()));
        return result;

    }

    public static JSONObject requestListAllDriveId(String protocol, String dapp_addr, Integer page, Integer detail, String timestamp, String signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("protocol", protocol);
        param.put("dapp_addr", dapp_addr);
        param.put("page", page);
        param.put("detail", detail);
        param.put("timestamp", timestamp);
        param.put("dapp_signature", signature);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/list_all_drive_id", param.toJSONString()));
        return result;

    }

    public static JSONObject requestTerminateDriveId(String user_addr, String dapp_addr, String drive_id, String[] admins, String[] members, String timestamp, String user_signature) throws Exception {

        JSONObject param = new JSONObject();
        param.put("user_addr", user_addr);
        param.put("dapp_addr", dapp_addr);
        param.put("drive_id", drive_id);
        param.put("admin", admins);
        param.put("member", members);
        param.put("timestamp", timestamp);
        param.put("user_signature", user_signature);
        System.out.println(param.toJSONString());
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/api/set_auth", param.toJSONString()));
        return result;

    }


    public static String signMsg(String msg, String privateKey) {
        NetworkParameters networkParameters = MainNetParams.get();
        DumpedPrivateKey priKey = DumpedPrivateKey.fromBase58(networkParameters, privateKey);
        ECKey ecKey = priKey.getKey();
        return ecKey.signMessage(msg);
    }


    public static JSONObject charge(String addr, String value) throws Exception {

        Map param = new HashedMap();
        param.put("addr", addr);
        param.put("value", value);
        JSONObject result = (JSONObject) JSONObject.parse(HttpUtil.doPost("http://freedrive.cash:8880/points/charge", param));
        return result;

    }



}
