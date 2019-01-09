/**
 * Created by ncarballo on 2/3/18.
 */


import org.joda.time.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.lang.*;
import java.util.*;
import java.util.stream.Collectors;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import static org.joda.time.DateTime.*;

class main
{
  public static void main(String args[]) throws JSONException {

    JSONObject jsonObj1 = new JSONObject("{\"payment\":{\"id\":111111}}");
    System.out.println(jsonObj1);
//    JSONObject jsonObj2 = new JSONObject("{\"id\":000000}");
//
//    long idFormJsonobject = getPaymnetId(jsonObj2,"TC");
//    idFormJsonobject = getPaymnetId(jsonObj1,"DOC");
//    idFormJsonobject = getPaymnetId(jsonObj1,"IP");
//    pruebaSwitch();
//      splitString();
//        getJsonBonito();
//      listOfMap();

//    List<String> list=new ArrayList<>();
//    list.add("UNO");
//    list.add("DOS");
//
//    String joined = String.join("+", list);
//
//    obtenerDay(1538575200337l);
//    Map<String, Object> mapForFilterDates = new HashMap<>();
//    mapForFilterDates.put("2018-05-04",0);
//    mapForFilterDates.put("2017-04-22",1);
//    filterDates(mapForFilterDates,trabajarConFechas());

    //trabajarConFechas();

    //jodaExample();

    //JSONObject orderResp = recorrerJsonRespuesta();

    buscarString();

    //subString();

    System.out.println("Hello, World!");
  }

  private static void obtenerDay(long l) {

    DateTime now = now();

    DateTime lTime=new DateTime(l);

    if (lTime.isBefore(now().minusMinutes(10))){
      System.out.println("lTime mas 10 es antes de ahora");
    }
    //Date dia = new Date(l);
    System.out.println(lTime);
  }

  private static void pruebaSwitch() {
    String valorNulo=null;
    switch (valorNulo){
      case "algo":
        System.out.println("algo");
        break;
      default:
        System.out.println("no algo");
    }
    System.out.println("no importa porque va a fallar antes");
  }

  private static void listOfMap() {
    String value = "account_login=181313842&account_login_first_seen=2015-04-16&account_login_last_event=2016-11-16&account_login_last_update=2016-11-16&account_login_result=success&account_login_score=0&account_login_worst_score=0&agent_type=browser_computer&api_call_datetime=2016-11-16 10:15:25.452&api_version=7.5&browser=Safari&browser_language=es-es&browser_string=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/601.7.7 (KHTML, like Gecko) Version/9.1.2 Safari/537.86.7&browser_string_hash=be5add1724b6a9a72de6677fb8072a4f&browser_version=9.1&css_image_loaded=yes&custom_match_1=2b8e51399f06b750f8c1d222ecec7c3a&custom_match_2=e42d199b8c6dcc093bdda30e7615a810&custom_match_3=f6aad0a5f51f1cdf09c32d719cdadf0a&custom_match_4=be5add1724b6a9a72de6677fb8072a4f&detected_fl=yes&device_first_seen=2015-09-06&device_id=6da34efa1b6a470ebbc3f5914e620c0d&device_id_confidence=100.00&device_last_event=2016-11-16&device_last_update=2016-11-16&device_match_result=success&device_result=success&device_score=0&device_worst_score=0&dns_ip=200.49.130.41&dns_ip_city=buenos aires&dns_ip_geo=AR&dns_ip_isp=cablevision s.a.&dns_ip_latitude=-34.61178&dns_ip_longitude=-58.41731&dns_ip_organization=cablevision s.a.&dns_ip_region=ciudad de buenos aires&enabled_ck=yes&enabled_fl=yes&enabled_im=yes&enabled_js=yes&event_type=payment&flash_lang=es&flash_os=Mac OS 10.9.5&flash_system_state=1475394186&flash_version=MAC 23,0,0,185&fuzzy_device_first_seen=2015-09-06&fuzzy_device_id=6da34efa1b6a470ebbc3f5914e620c0d&fuzzy_device_id_confidence=100.00&fuzzy_device_last_event=2016-11-16&fuzzy_device_last_update=2016-11-16&fuzzy_device_match_result=success&fuzzy_device_result=success&fuzzy_device_score=0&fuzzy_device_worst_score=0&headers_name_value_hash=e9e188d0bd5f9ebefbf8540e07306949&headers_order_string_hash=97dff6546e4043e9c1a293abdfc215af&http_os_signature=iOS 6+ or Mac OS 10.8+&http_referer=CHe9I99cd4o6NfN874F5HheHe2hGKj!4&http_referer_domain=buyingflow.mercadolibre.com.ar&http_referer_url=https://buyingflow.mercadolibre.com.ar/shippingDesktopPE/start&image_loaded=yes&js_browser=Safari 9.1&js_browser_string=Mozilla/5.0 (Macintosh; Intel Mac OS X 10_9_5) AppleWebKit/601.7.7 (KHTML, like Gecko) Version/9.1.2 Safari/537.86.7&js_browser_string_hash=be5add1724b6a9a72de6677fb8072a4f&js_fonts_hash=d94cbfcf3e159d43701709604dab2765&js_fonts_number=36&js_os=Mac OS X 10_9_5&local_attrib_1=mla&mime_type_hash=bc402e4158d19ff6c6e069ed8af16312&mime_type_number=77&org_id=jk96mpy0&os=OS X&os_fonts_hash=0d3b6ea3e40db21fe15184df3f240881&os_fonts_number=683&os_version=10.9.5&page_time_on=32291&plugin_adobe_acrobat=15.017.20053&plugin_flash=23.0 r0&plugin_hash=7d49cb5d7a8ae6673cfe7f2fae5a5123&plugin_number=15&plugin_quicktime=7.7.3&policy=default&policy_score=10&profiled_domain=buyingflow.mercadolibre.com.ar&profiled_url=https://buyingflow.mercadolibre.com.ar/selectPaymentDesktop/selectPaymentMethod/d1bf07f9b7a6d899bd613420d0f699465ed5ef35&profiling_datetime=1479291293&reason_code=6months_ant_device&reason_code=6months_ant_smart&reason_code=1year_ant_device&reason_code=1year_ant_smart&request_duration=77&request_id=82874fad-8dc7-42c7-931b-876202f505a2&request_result=success&review_status=pass&risk_rating=trusted&screen_color_depth=24&screen_dpi=72&screen_res=2560x1440&service_type=session-policy&session_id=2ce733f4-d64a-4379-8a31-e72cfceecb9f&session_id_query_count=1&summary_risk_score=10&tcp_os_signature=iOS 6+ or Mac OS 10.8+&time_zone=-180&time_zone_dst_offset=0&transaction_id=2445982549&true_ip=181.29.142.233&true_ip_city=buenos aires&true_ip_first_seen=2016-05-30&true_ip_geo=AR&true_ip_isp=cablevision s.a.&true_ip_last_event=2016-11-16&true_ip_last_update=2016-11-16&true_ip_latitude=-34.61178&true_ip_longitude=-58.41731&true_ip_organization=cablevision s.a.&true_ip_region=ciudad de buenos aires&true_ip_result=success&true_ip_score=0&true_ip_worst_score=0&ua_browser=safari 0.0&ua_os=macosx&ua_platform=safari generic";

    Map thmData = new HashMap();
    thmData.put("type", "thm");
    thmData.put("value", value);

    List externalDevice = new LinkedList();

    externalDevice.add(thmData);

    return;
  }

  private static Map<String, Object> splitString() {
    String input="account_login=151211818&account_login_first_seen=2013-12-20&account_login_last_event=2018-07-25&account_login_last_update=2018-07-25&account_login_result=success&account_login_score=0&account_login_worst_score=0&api_call_datetime=2018-07-25 15:52:06.327&api_version=9.3&digital_id_result=not_enough_attribs&event_type=payment&local_attrib_1=mlb&local_attrib_1_first_seen=2014-07-04&org_id=jk96mpy0&policy=default&policy_score=-5&primary_industry=ecommerce&reason_code=Unknown Session&reason_code=NoDeviceID&request_duration=16&request_id=db73b758-a5e1-464a-83c1-c726d225920d&request_result=success&review_status=pass&risk_rating=low&secondary_industry=marketplace&service_type=session-policy&session_id=0353c9b33f8e99a87cd07fabcf721826e7a6bfc7b67fa21ae1e8a46718ad29b8&session_id_query_count=1&smart_learning_variables={}&summary_risk_score=-5&tmx_variables={\"_acclogin_local_velocity_hour\":\"0\"}&transaction_id=3968469995&unknown_session=yes";
    Map<String,Object> response=new HashMap<>();
    for (String param : input.split("&")) {

      if(param.split("=").length >= 2){

        String fieldName = param.split("=")[0];
        String value = param.split("=")[1];
        if(fieldName.toLowerCase().equals("device_first_seen"))
        {
          fieldName = "device_id_first_seen";
        }
        response.put(fieldName,value);
        //BeanUtils.setProperty(result, fieldName, param.split("=")[1]);
      }
    }
    return response;
  }


  private static Long getPaymnetId(JSONObject paymentMessage, String transactionName) throws JSONException {
    Long paymentId=null;
    switch (transactionName) {
      case "TC" : {
        paymentId = paymentMessage.getLong("id");
        break;
      }
      case "DOC":{
        JSONObject payment = paymentMessage.getJSONObject("payment");
        paymentId = payment.getLong("id");
        break;
      }
      case "IP": {
        JSONObject payment = paymentMessage.getJSONObject("payment");
        paymentId = payment.getLong("id");
        break;
      }
    }

    return paymentId;
  }


  private static void subString(){
    String trueIp="12.18.1.1";
    trueIp=trueIp.substring(0,trueIp.lastIndexOf("."));
    System.out.println(trueIp);

  }
  private static void filterDates(Map<String, Object> dateMap, DateTime approvedDate) {

    DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
    DateTime anYearAgo = new DateTime().minusDays(365);

    // Check if the approved date is in the range of one year
    // If it is true, record it as a history.

    if (approvedDate.isAfter(anYearAgo)) {
      dateMap.put(new LocalDate(approvedDate).toString(), 0);
    }

    // Collect only the dates that are in the range of one year
    Map<String, Object> availableDates;
    availableDates = dateMap.entrySet().stream().filter(map -> (anYearAgo.isBefore(dtf.parseDateTime(map.getKey())))).distinct().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    return;
  }

  private static void buscarString() {
    int cantidad=0;
    int exito=0;
    String dondeBuscar=getStringToFind();
    String[] queBuscar  = getQueBuscar();
        //{"phtc_amt_25_app_acc_1d","phtc_amt_25_app_acc_3d"};
    List<String> resultado = new LinkedList<>();
    for (String palabra : queBuscar) {
      cantidad++;
      if (!dondeBuscar.contains(palabra.replace(" ",""))) {
        //exito++;
        resultado.add(palabra.replace(" ",""));
      }
    }
    System.out.println(resultado);
    System.out.println(String.format("exito: %d total: %d",exito,cantidad));
  }


  private static DateTime trabajarConFechas(){
    String fecha = "2018-06-04T10:16:08.000-0400";
    String unDiaStr = "2017-05-30T10:16:08.000-0400";
    DateTime diaDateTime;
    DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    //DateTimeFormatter dtfMal = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSz");
    //DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
    diaDateTime = dtf.parseDateTime(fecha);
    //diaDateTime = dtfMal.parseDateTime(fecha);
    DateTime anYearAgo=new DateTime().minusDays(365);
    LocalDate ld=new LocalDate(diaDateTime);
    DateTime unDia=dtf.parseDateTime(unDiaStr);

    if(anYearAgo.isBefore(unDia)) {
      System.out.println("SI");
    }
    if(unDia.isAfter(anYearAgo)){
      System.out.println("tambien aca");
    }

    return diaDateTime;
  }

  private static void jodaExample(){
    DateTimeFormatter dateFormat = DateTimeFormat
        .forPattern("G,C,Y,x,w,e,E,Y,D,M,d,a,K,h,H,k,m,s,S,z,Z");

    String dob = "2002-01-15";
    LocalTime localTime = new LocalTime();
    LocalDate localDate = new LocalDate();
    DateTime dateTime = new DateTime();
    LocalDateTime localDateTime = new LocalDateTime();
    DateTimeZone dateTimeZone = DateTimeZone.getDefault();

    System.out
        .println("dateFormatr : " + dateFormat.print(localDateTime));
    System.out.println("LocalTime : " + localTime.toString());
    System.out.println("localDate : " + localDate.toString());
    System.out.println("dateTime : " + dateTime.toString());
    System.out.println("localDateTime : " + localDateTime.toString());
    System.out.println("DateTimeZone : " + dateTimeZone.toString());
    System.out.println("Year Difference : "
        + Years.yearsBetween(DateTime.parse(dob), dateTime).getYears());
    System.out.println("Month Difference : "
        + Months.monthsBetween(DateTime.parse(dob), dateTime)
        .getMonths());

  }
  private static JSONObject recorrerJsonRespuesta() throws JSONException {
    Set<HashMap<String,Object>> order = new HashSet<>();

    JSONObject orderResp = llenarJson();

    JSONArray items=orderResp.getJSONArray("order_items");
    for (int i=0; i<items.length(); i++){
      HashMap<String, Object> inputsMap = new LinkedHashMap<String, Object>();


      JSONObject item = items.getJSONObject(i);
      JSONObject seller =orderResp.getJSONObject("seller");
      JSONObject itemField=item.getJSONObject("item");
      JSONObject shipping =orderResp.getJSONObject("shipping");
      JSONObject feedback=orderResp.getJSONObject("feedback");

      inputsMap.put("seller_id",seller.get("id"));
      inputsMap.put("total_amount",orderResp.get("total_amount"));
      inputsMap.put("status",orderResp.get("status"));
      if(!(orderResp.get("status_detail").equals(null))) {
        inputsMap.put("status_detail",orderResp.get("status_detail"));
      }
      inputsMap.put("shipping_status",shipping.get("status"));
      inputsMap.put("item_id",itemField.get("id"));
      inputsMap.put("item_tittle",itemField.get("title"));
      inputsMap.put("shipping_mode",shipping.get("shipping_mode"));
      inputsMap.put("date_closed",orderResp.get("date_closed"));
      inputsMap.put("last_updated",orderResp.get("last_updated"));

      inputsMap.put("feedback_sale_date_created",null);
      inputsMap.put("feedback_sale_fulfilled",null);
      inputsMap.put("feedback_sale_rating",null);

      if(!(feedback.get("sale").equals(null))){
        JSONObject feedbackSale = feedback.getJSONObject("sale");
        if(!(feedbackSale.get("date_created").equals(null))){
          inputsMap.put("feedback_sale_date_created",feedbackSale.get("date_created"));
        }

        if(!(feedbackSale.get("fulfilled").equals(null))){
          if (feedbackSale.get("fulfilled").equals(true)){
            inputsMap.put("feedback_sale_fulfilled","Y");
          }
          else{
            inputsMap.put("feedback_sale_fulfilled","N");
          }
        }

        if(!(feedbackSale.get("rating").equals(null))) {
          inputsMap.put("feedback_sale_rating", feedbackSale.get("rating"));
        }
      }

      inputsMap.put("feedback_purchase_date_created",null);
      inputsMap.put("feedback_purchase_fulfilled",null);
      inputsMap.put("feedback_purchase_rating",null);

      if(!(feedback.get("purchase").equals(null))) {
        JSONObject feedbackPurchase = feedback.getJSONObject("purchase");

        if (!(feedbackPurchase.get("date_created").equals(null))) {
          inputsMap.put("feedback_purchase_date_created", feedbackPurchase.get("date_created"));
        }

        if (!(feedbackPurchase.get("fulfilled").equals(null))) {
          if (feedbackPurchase.get("fulfilled").equals(true)){
            inputsMap.put("feedback_purchase_fulfilled", "Y");
          }
          else {
            inputsMap.put("feedback_purchase_fulfilled", "N");
          }
        }

        if (!(feedbackPurchase.get("rating").equals(null))) {
          inputsMap.put("feedback_purchase_rating", feedbackPurchase.get("rating"));
        }
      }

      if(orderResp.getJSONArray("payments").length()>0){
        inputsMap.put("is_payed","Y");
      }else {
        inputsMap.put("is_payed","N");
      }
      inputsMap.put("last_updated",orderResp.get("last_updated"));

      order.add(inputsMap);
    }
    return orderResp;
  }

  public static void getJsonBonito() {
    String a="{\n" +
        " \"additional_info\": {\n" +
        "       \"binary_mode\": false,\n" +
        "       \"client_id\": \"5668989849520934\",\n" +
        "       \"has_encrypted_cvv\": false,\n" +
        "       \"item_id\": \"ON\",\n" +
        "       \"keystroke\": \"bjDQU1526559571159ryxyJ\",\n" +
        "       \"meli_session_id\": \"5afd6f236c602d05b6c4522d\",\n" +
        "       \"payer_doc_number\": \"153106908\",\n" +
        "       \"payer_doc_type\": \"RUT\",\n" +
        "       \"payer_identification_mode\": \"active\",\n" +
        "       \"payer_name\": \"Jimena Uribe\",\n" +
        "       \"preference_id\": \"219699444-93d1c7e0-d5fd-444b-b311-3d0ff36b6f22\",\n" +
        "       \"processing_mode\": \"aggregator\",\n" +
        "       \"profile_id\": \"mercadopago\",\n" +
        "       \"session_id\": \"5cf06766-5e27-4f44-91e5-a6f7ca8be154\",\n" +
        "       \"tracking_id\": {\n" +
        "         \"operatingSystem\": \"android\",\n" +
        "         \"platform\": \"Web\",\n" +
        "         \"type\": \"N/A\"\n" +
        "       },\n" +
        "       \"transaction_dol_amount\": 375\n" +
        "     },\n" +
        "     \"config_id\": \"STD\",\n" +
        "     \"payment_id\": 3080140427,\n" +
        "     \"authenticated_user\": \"Y\",\n" +
        "     \"site_id\": \"MLC\",\n" +
        "     \"sender_id\": 321939251,\n" +
        "     \"reference_id_nw\": 3736556875,\n" +
        "     \"session_id\": \"5cf06766-5e27-4f44-91e5-a6f7ca8be154\"\n" +
        "}";
    System.out.println(a);
    return ;
  }

  public static String[] getQueBuscar() {
    return new String[]{
        "SM-J500M_6.0.1","Moto G (4)_7.0","SM-J700M_6.0.1","SM-G610M_7.0","Moto G (5)_7.0","SM-J710MN_7.0","SM-G570M_7.0","LG-K430_6.0","SM-G610M_6.0.1","Moto G (5) Plus_7.0","MotoG3_6.0","LG-M250_7.0","SM-G532MT_6.0.1","Moto G Play_7.1.1","Moto G (5S)_7.1.1","Moto G (5S) Plus_7.1.1","SM-G950F_8.0.0","SM-G935F_7.0","SM-G532M_6.0.1","Moto E (4) Plus_7.1.1","SM-G955F_8.0.0","SM-J710MN_6.0.1","SM-G610M_8.1.0","SM-G531H_5.1.1","SM-J320M_5.1.1","moto g(6) play_8.0.0","Moto Z2 Play_8.0.0","XT1069_6.0","SM-G570M_8.0.0","SM-J701M_7.0","Moto C Plus_7.0","LG-M320_7.0","SM-J730G_7.0","SM-G930F_7.0","SM-J120H_5.1.1","SM-J105B_5.1.1","Moto E (4)_7.1.1","Moto G (5)_8.1.0","Moto Z2 Play_7.1.1","D101AP_11.4.1","SM-G530BT_5.0.2","SM-J701MT_7.0","N61AP_11.4.1","SM-G935F_8.0.0","SM-G570M_6.0.1","SM-J510MN_7.1.1","SM-J530G_7.0","moto g(6) plus_8.0.0","Moto X Play_7.1.1","SM-G9650_8.0.0","Moto G (5S) Plus_8.1.0","SM-A520F_7.0","Moto G (5) Plus_8.1.0","SM-G925I_7.0","XT1033_5.1","XT1635-02_7.1.1","XT1068_6.0","SM-A510M_7.0","SM-G950F_7.0","Redmi Note 4_7.0","LG-M700_7.1.1","SM-G920I_7.0","LG-X230_6.0","LG-K220_6.0.1","Moto G Play_6.0.1","moto x4_8.0.0","Moto G (5S)_8.1.0","SM-A500M_6.0.1","XT1635-02_8.0.0","LG-K350_6.0","D111AP_11.4.1","SM-G955F_7.0","D101AP_12.1","SM-G530H_4.4.4","SM-G600FY_6.0.1","SM-A720F_7.0","N61AP_11.2.6","SM-A520F_8.0.0","SM-G531BT_5.1.1","moto g(6)_8.0.0","D101AP_11.4","SM-N950F_8.0.0","D101AP_11.2.6","D221AP_11.4.1","CAM-L03_6.0","SM-G9600_8.0.0","N61AP_11.4","SM-G930F_8.0.0","MotoE2(4G-LTE)_6.0","Moto C_7.0","SM-J200BT_5.1.1","N61AP_11.3.1","SM-J111M_5.1.1","SM-J510MN_6.0.1","D101AP_11.3.1","XT1097_6.0","GT-I8552B_4.1.2","N41AP_10.3.3","SM-J701MT_8.1.0","N61AP_12.1","SM-J530G_8.1.0","N71AP_11.4.1","Lenovo K33b36_7.0","N71mAP_11.4.1","SM-G900M_6.0.1","SM-J200M_5.1.1","Lenovo A6020l36_5.1.1","D111AP_12.1","Lenovo A6020l36_6.0.1","ASUS_Z012DC_8.0.0","D211AP_11.4.1","Redmi 4X_7.1.2","Mi A1_8.1.0","SM-G531M_5.1.1","LG-K200_6.0.1","SM-A300M_5.0.2","D221AP_12.1","D111AP_11.4","ALE-L23_5.0.1","D101AP_12.0.1","D101AP_11.3","N61AP_11.3","D111AP_11.2.6","LG-D337_5.0.2","SM-J730G_8.1.0","SM-J400M_8.0.0","SM-A720F_8.0.0","SM-N950F_7.1.1","ASUS_Z00AD_5.0","LG-M400_7.0","D111AP_11.3.1","SM-J710MN_8.1.0","Lenovo K10a40_6.0","Redmi Note 5_8.1.0","ANE-LX3_8.0.0","SM-G355M_4.4.2","SM-J600GT_8.0.0","ASUS_X013D_5.1.1","Moto Z (2)_8.0.0","D211AP_12.1","SM-J810M_8.0.0","D201AP_11.4.1","N53AP_11.4.1","N61AP_11.2.5","ASUS_X00LD_7.1.1","SM-J700M_5.1.1","SM-J730GM_7.0","D101AP_11.2.5","D221AP_11.4","HUAWEI VNS-L23_7.0","SM-J500M_5.1.1","SM-A910F_7.0","N94AP_9.3.5","LG-K130_5.1.1","SM-G360BT_5.0.2","N71mAP_12.1","N61AP_12.0.1","N71AP_11.2.6","N71AP_12.1","N49AP_10.3.3","SM-G611MT_8.0.0","N71AP_11.4","N53AP_11.2.6","N61AP_11.2.2","D111AP_12.0.1","D10AP_11.4.1","D111AP_11.3","SM-G800H_6.0.1","D101AP_12.0","D201AP_12.1","N71mAP_11.4","LG-X240_6.0","ASUS_Z00UD_6.0.1","N71mAP_11.2.6","N71AP_11.3.1","SM-J701M_8.1.0","HUAWEI VNS-L23_6.0","GT-I9063T_4.2.2","MotoG3-TE_6.0","N71mAP_11.3.1","D101AP_11.2.2","Lenovo K53b36_7.0","Mi A1_8.0.0","XT1032_5.1","SM-A530F_8.0.0","ASUS_X00DDA_7.1.1","D22AP_11.4.1","XT1078_6.0","SM-A530F_7.1.1","Lenovo A2016b30_6.0","N61AP_11.2.1","D221AP_11.3.1","moto e5_8.0.0","D211AP_11.4","D221AP_12.0","SM-G530H_5.0.2","D11AP_11.4.1","D221AP_12.0.1","BLL-L23_6.0","D111AP_11.2.5","ASUS_X008DB_7.0","SM-G928G_7.0","N56AP_11.4.1","N61AP_12.0","SM-T560_4.4.4","SM-G530M_5.0.2","Lenovo K33b36_6.0.1","GT-I9192_4.4.2","ASUS_Z017DC_8.0.0","N53AP_11.3.1","D101AP_11.2.1","SM-N920G_7.0","ASUS_X00ID_7.1.1","8050E_5.1","N66AP_11.4.1","N69AP_11.4.1","4034E_6.0","N71AP_11.3","D111AP_12.0","RNE-L03_7.0","D211AP_12.0.1","FIG-LX3_8.0.0","ALE-L23_6.0","Redmi 5 Plus_8.1.0","Moto Z3 Play_8.1.0","SM-N910C_6.0.1","ASUS_Z01KD_8.0.0","D221AP_11.2.6","SM-J250M_7.1.1","SM-A710M_7.0","RNE-L03_8.0.0","N53AP_11.4","N71mAP_11.3","N71mAP_12.0.1","D211AP_11.3.1","SM-J105M_5.1.1","SM-A310M_7.0","SM-A720F_6.0.1","D10AP_12.1","N69uAP_11.4.1","LG-K580_6.0","D201AP_11.4","D111AP_11.2.2","N71AP_12.0.1","SM-G360M_5.0.2","SM-G900MD_6.0.1","SM-G611MT_7.1.1","SM-T116BU_4.4.4","XT1225_6.0.1","HUAWEI RIO-L03_5.1","GT-I9505_5.0.1","N51AP_11.4.1","5010E_6.0","LG-H815_6.0","ASUS_Z00AD_6.0.1","D22AP_12.1","XT1058_5.1","LG-H440AR_5.0.1","SM-G925I_6.0.1","D221AP_11.3","SM-G903M_6.0.1","LG-K120_5.1.1","LG-H870_7.0","N53AP_11.3","moto e5 plus_8.0.0","N71AP_11.2.5","D10AP_11.4","XT1572_7.0","D101AP_12.1.2","G3313_7.0","GT-I9082L_4.2.2","G3123_8.0.0","Redmi Note 3_6.0.1","D201AP_12.0.1","D11AP_12.1","D21AP_11.4.1","F3213_7.0","XT1040_5.1","D211AP_11.2.6","XT1033_4.4.4","N56AP_11.2.6","XT1580_7.0","WAS-LX3_7.0","N61AP_10.3.3","TRT-LX3_7.0","D10AP_11.2.6","N71mAP_11.2.5","MotoG3_6.0.1","N53AP_11.2.5","SM-G3502T_4.3","D211AP_12.0","SM-G935F_6.0.1","N61AP_12.1.2","SM-G900H_6.0.1","D111AP_11.2.1","MotoE2_5.1","ASUS_T00J_4.4.2","D22AP_11.4","Redmi 5 Plus_7.1.2","SM-J110M_5.1.1","D10AP_11.3.1","N48AP_10.3.3","D201AP_11.3.1","S455_5.0.2","XT1650_8.0.0","N53AP_12.1","LG-H840_7.0","SM-G7102T_4.3","ASUS_Z00LD_6.0.1","N66AP_11.2.6","ASUS_X00LD_8.1.0","N56AP_11.4","D11AP_11.4","N71AP_11.2.2","D211AP_11.3","N69AP_12.1","ASUS_Z017DC_7.0","N56AP_11.3.1","D11AP_11.3.1","MI 6_8.0.0","N66AP_11.4","G3223_8.0.0","N66mAP_11.4.1","N51AP_11.2.6","Quantum MUV PRO_6.0","XT1563_6.0.1","LG-H422_5.0.1","WAS-LX3_8.0.0","GT-I8190L_4.1.2","D10AP_12.0.1","N71AP_12.0","Lenovo A7010a48_6.0","N66AP_11.3.1","D11AP_11.2.6","ONEPLUS A5010_8.1.0","SM-J600G_8.0.0","SM-A730F_8.0.0","N71mAP_12.0","iPhone_12.1","GT-I9300I_4.4.4","N69AP_11.4","SM-A605GN_8.0.0","ASUS_Z012DC_7.0","SM-A730F_7.1.1","LG-K500_6.0.1","GT-I9300_4.3","SM-T113NU_4.4.4","S60_6.0.1","D201AP_11.2.6","SM-N9600_8.1.0","N71mAP_11.2.2","Redmi Note 5A Prime_7.1.2","GT-I9500_5.0.1","Redmi 4A_7.1.2","PRA-LX3_7.0","N66AP_12.1","SM-N9005_5.0","N53AP_11.2.2","SM-J106M_6.0.1","XT1650_7.1.1","SM-E700M_5.1.1","D111AP_12.1.2","HUAWEI SCL-L03_5.1.1","GT-I9060C_4.4.4","D21AP_12.1","SM-G530BT_4.4.4","N69uAP_12.1","D331pAP_12.1","XT1032_4.4.4","LG-X220_5.1","N61AP_11.1.2","N71AP_11.2.1","SM-G110B_4.4.2","D201AP_12.0","GT-I9515L_5.0.1","N56AP_12.1","E5606_6.0","F3113_7.0","D22AP_11.3.1","9008J_7.0","Mi A2 Lite_8.1.0","N42AP_10.3.3","SM-A700FD_6.0.1","D221AP_12.1.2","SM-G950U1_8.0.0","ONEPLUS A5000_8.1.0","N53AP_11.2.1","D22AP_12.0.1","D221AP_11.2.5","D22AP_12.0","N69uAP_11.4","D11AP_12.0.1","N69uAP_11.2.6","LG-K410_5.0.2","N69AP_11.2.6","N69AP_11.3.1","D10AP_11.3","N51AP_11.3.1","ASUS_A007_6.0.1","SM-J700H_6.0.1","ASUS_Z00VD_5.1","SM-G610F_6.0.1","GT-I9060M_4.4.4","N71mAP_11.2.1","LG-H650_6.0","MI MAX 2_7.1.1","N51AP_11.4","GT-S7582L_4.2.2","moto x4_9","SM-G900M_5.0","D20AP_11.4.1","E2306_6.0.1","N56AP_11.3","ALP-L09_8.0.0","D201AP_11.3","N66AP_11.3","N69uAP_11.3.1","TRT-L53_7.0","LG-H540_5.0.2","SM-E500M_5.1.1","D22AP_11.2.6","D6543_6.0.1","LG-H502_5.0.1","D21AP_11.4","SM-G920F_7.0","SM-J100M_4.4.4","D211AP_12.1.2","N53AP_10.3.3","SM-T111M_4.2.2","LG-D337_4.4.2","LG-D690n_5.0.2","D11AP_11.3","Positivo Twist M_6.0","LG-H340AR_5.0.1","XT1025_4.4.4","D5322_5.1.1","Mi A2_8.1.0","E6603_7.1.1","ZE553KL_8.0.0","Lenovo K53b36_6.0.1","5045J_6.0","F3313_6.0","EVA-L09_7.0","Redmi 3S_6.0.1","SM-G920I_6.0.1","N51AP_11.3","D10AP_12.0","LG-D410_5.0.2","N56AP_11.2.5","F5121_8.0.0","Lenovo A6020l37_5.1.1","SM-G610F_7.0","N71mAP_12.1.2","N71AP_12.1.2","D22AP_11.3","Redmi S2_8.1.0","N69AP_12.0.1","D211AP_11.2.5","D10AP_11.2.5","Redmi Note 4_6.0","SM-G318ML_4.4.4","SM-J100MU_4.4.4","FLA-LX3_8.0.0","XT1063_6.0","N53AP_12.0.1","6039A_5.0.2","SM-G925F_7.0","LG-D325_4.4.2","Hisense F23_7.0","SM-A910F_8.0.0","LG-H818_6.0","D21AP_11.3.1","D101AP_11.1.2","9008A_7.0","LG-H630_6.0","ASUS_X00DDA_8.1.0","SM-T110_4.2.2","motorola one_9","EVA-L09_6.0","D20AP_12.1","LG-H222_4.4.2","D11AP_12.0","N66AP_11.2.5","N66AP_12.0.1","N69AP_11.3","N69uAP_11.3","ONEPLUS A3000_8.0.0","SM-G800H_4.4.2","N66mAP_12.1","N66mAP_11.2.6","D201AP_12.1.2","N66mAP_11.4","SM-G930F_6.0.1","D21AP_11.2.6","F3116_7.0","5051J_6.0.1","N56AP_11.2.2","N51AP_12.1","D21AP_12.0.1","ASUS_Z011D_6.0.1","ASUS_Z01MD_7.1.1","SM-A510M_6.0.1","N69uAP_12.0.1","BLL-L23_7.0","LG-D385_4.4.2","D6643_6.0.1","D221AP_11.2.2","ASUS_X00ADA_6.0.1","Redmi 5A_7.1.2","D10AP_11.2.2","XT1022_4.4.4","N51AP_11.2.5","HUAWEI VNS-L53_7.0","HUAWEI NXT-L09_7.0","SM-T561M_4.4.4","SM-N900_5.0","ZE553KL_7.1.1","SM-J110L_4.4.4","D11AP_11.2.5","SM-G530M_4.4.4","N66mAP_11.3.1","LG-H635_6.0","N56AP_12.0.1","XT1575_7.0","G3123_7.0","ASUS_X00ID_8.1.0","SM-A520F_6.0.1","LG-H342_5.0.1","SM-G955U1_8.0.0","Moto G (4)_6.0.1","GT-I8262B_4.1.2","N66AP_11.2.1","FL8006_5.1.1","Blade V6 Plus_6.0","XT1635-02_7.0","SM-J120M_5.1.1","MUV_6.0","CRO-L03_6.0","LG-H522_5.0.2","SM-J730GM_8.1.0","G8141_8.0.0","LG-D227_4.4.2","ZB500KG_5.1.1","SM-G710_4.3","SM-T285M_5.1.1","N56AP_11.2.1","Vivo 5R_7.0","D201AP_11.2.5","iPhone_11.4.1","LG-H735_6.0","GT-S7273T_4.2.2","4017F_5.1","G3223_7.0","MotoG3_5.1.1","SM-G360M_4.4.4","iPhone_12.0.1","Redmi Note 5A_7.1.2","N66AP_11.2.2","SM-G313ML_4.4.2","D101AP_10.3.3","moto e5 play_8.1.0","N61AP_10.2.1","RNE-L23_8.0.0","GT-I8200L_4.2.2","Redmi Note 6 Pro_8.1.0","Redmi 5_7.1.2","N69uAP_11.2.5","ASUS_X00QD_8.0.0","SM-A500M_5.0.2","LG-H326_5.0.1","LM-X210_7.1.2","D10AP_11.2.1","MYA-L13_6.0","D211AP_11.2.2","LDN-LX3_8.0.0","Quantum Go_6.0","N69AP_11.2.5","D21AP_11.3","D21AP_12.0","N51AP_11.2.2","D321AP_12.1","P105AP_9.3.5","SM-G965F_8.0.0","SM-G3812B_4.2.2","D20AP_11.4","N71AP_10.3.3","MS45S_5.1","GT-S6293T_4.1.2","N53AP_11.1.2","N69AP_12.0","ASUS_Z00YD_5.1","SM-G955U_7.0","N53AP_12.0","SLA-L03_7.0","N66AP_12.0","D11AP_11.2.2","N66mAP_11.3","ASUS_T00J_5.0","SM-N920C_7.0","HUAWEI TAG-L13_5.1","D111AP_11.1.2","SM-G955U_8.0.0","Nexus 6P_8.1.0","SM-G965U1_8.0.0","XT1635-02_6.0.1","E2124_4.4.4","LG-H850_7.0","N61AP_10.3.2","Mi MIX 2_8.0.0","Mi A1_7.1.2","D221AP_11.2.1","EML-L09_8.1.0","N51AP_11.2.1","ASUS_Z00XS_6.0.1","N51AP_10.3.3","N56AP_12.0","N66mAP_12.0.1","D22AP_11.2.5","SM-N950U_8.0.0","LG-H650_5.1.1","5044O_6.0","N61AP_11.0.3","N71mAP_10.3.3","VTR-L09_8.0.0","MS40S_6.0","N53AP_10.2.1","5016J_5.1","SM-G3502L_4.3","D6633_6.0.1","N69uAP_12.0","BLADE V8 SE_7.0","SM-G130BU_4.4.4","D101AP_12.1.1","XT1034_4.4.2","P101AP_10.3.3","N69AP_11.2.2","N69uAP_11.2.2","N71AP_11.1.2","D201AP_11.2.2","D20AP_12.0.1","E2363_5.0","GT-N7100_4.4.2","D211AP_11.2.1","LG-K530_6.0.1","ASUS_X014D_5.1.1","motorola one_8.1.0","D10AP_12.1.2","E6533_7.1.1","Twist Mini_6.0","SM-G900F_6.0.1","SM-J106H_6.0.1","E6633_7.1.1","CLT-L04_8.1.0","Positivo Twist 4G_6.0","Positivo Twist S_6.0","D22AP_12.1.2","N51AP_12.0.1","Life One X2_6.0.1","C6943_5.1.1","iPhone_12.0","LG-X180g_5.1","G8341_8.0.0","E6853_7.1.1","5046J_6.0","MS45S_A6_6.0","D11AP_11.2.1","D221AP_12.1.1","LG-H870_8.0.0","N53AP_12.1.2","F8331_8.0.0","G3423_8.0.0","N56AP_10.3.3","MS50L_7.0","MI 5_7.0","LG-H870AR_7.0","D2306_5.1.1","SM-N910U_6.0.1","RNE-L23_7.0","GT-I9060L_4.2.2","ASUS_Z01KD_7.1.1","XT1025_5.1","LG-K240_6.0.1","HTC Desire 10 lifestyle_6.0.1","SM-G935V_7.0","SM-T280_5.1.1","D20AP_11.3.1","Nexus 5X_8.1.0","SM-A300H_5.0.2","GT-I8260L_4.1.2","D331pAP_12.1.2","SM-N7502_4.3","D6503_6.0.1","LG-D693n_5.0.2","D20AP_11.2.6","LG-D295_4.4.2","SM-N950U_7.1.1","D11AP_12.1.2","MIX_7.0","S30_5.1","PAR-LX9_8.1.0","LG-H840_6.0.1","BAC-L03_7.0","Redmi 4A_6.0.1","MHA-L09_7.0","N66mAP_11.2.5","LM-X410.F_7.1.2","F3216_7.0","N71mAP_11.1.2","HUAWEI G7-L03_4.4.4","Lenovo PB2-650Y_6.0","BLA-L29_8.0.0","ALE-L23_5.0","GT-I9190_4.4.2","Lenovo K33a48_7.0","P102AP_10.3.3","SM-A500M_4.4.4","ONEPLUS A5000_8.0.0","D5833_6.0.1","HUAWEI CUN-L03_5.1","LG-D125_4.4.2","MHA-L29_8.0.0","iPhone_11.4","S40_5.1","SM-J500H_6.0.1","E6833_7.1.1","SNE-LX3_8.1.0","LG-H860_7.0","LG-H320_5.0.1","LG-D855_5.0","N841AP_12.1","R1 HD_6.0","Ultra Link_6.0","SM-N950U1_8.0.0","D21AP_11.2.5","SM-T210_4.4.2","D111AP_10.3.3","LG-H990_7.0","LG-D175f_4.4.2","N69uAP_11.2.1","BLN-L24_7.0","SM-G316M_4.4.4","D6603_6.0.1","LG-D690_5.0.2","SM-G950U_8.0.0","D2114_4.4.2","iPhone_12.1.2","LG-D855_6.0","N69AP_11.2.1","5080A_6.0","4009E_4.4.2","BAC-L03_8.0.0","SM-A910F_6.0.1","Lenovo A6020a40_5.1.1","BLU GRAND 5.5 HD_6.0","MI 5_8.0.0","LG-M700_8.1.0","2014819_5.1.1","D331pAP_12.0.1","SM-G530MU_4.4.4","F5122_8.0.0","Redmi 4_6.0.1","SM-G316ML_4.4.4","Nexus 5_6.0.1","D111AP_12.1.1","GT-I9195_4.4.2","HTC Desire 650_6.0.1","MHA-L09_8.0.0","Quantum Fly_6.0","SM-G920T_7.0","MI 5s_7.0","Twist (2018)_7.0","CAM-L23_6.0","G620S-L03_4.4.4","N61AP_12.1.1","D2403_5.1.1","XT1021_4.4.4","Quantum MUV UP_7.0","XT1663_7.0","SM-G900V_6.0.1","SM-G935U_7.0","N69AP_12.1.2","MS50S_6.0","D101AP_11.0.3","ONEPLUS A3010_8.0.0","5042A_4.4.4","LG-H221AR_4.4.2","E2306_5.0","SM-G130BT_4.4.4","D20AP_12.0","VTR-L09_7.0","GT-S7390L_4.1.2","LG-D410_4.4.2","D201AP_11.2.1","SM-G960U1_8.0.0","TA-1025_8.1.0","N66mAP_11.2.2","N66mAP_12.0","LG-X210_5.1","SM-G313MU_4.4.2","5085J_6.0","XT1069_5.0.2","Blade V6_5.0.2","N56AP_12.1.2","Mi A2_9","XT1064_6.0","XT1562_7.1.1","Nexus 6_7.1.1","SM-N900W8_5.0","SM-T211_4.4.2","E2363_6.0.1","6055B_6.0.1","N51AP_12.0","Vivo 8_7.0","ASUS_Z011D_5.0.2","XT1033_4.4.3","9008N_7.0","XT1068_5.0.2","SM-G920V_7.0","HUAWEI RIO-L03_6.0.1","N61AP_11.1.1","ASUS_X00LDA_7.1.1","Redmi 6_8.1.0","N66mAP_11.2.1","CLT-L29_8.1.0","VIVO 5_6.0","MI 8_8.1.0","Ultra Storm_7.0","BLU ADVANCE 4.0 L2_6.0","Redmi Note 4X_6.0","GT-S7392L_4.1.2","N66AP_12.1.2","moto x4_7.1.1","G8142_8.0.0","N551_6.0","Blade V580_5.1","LEX626_6.0","MHA-L29_7.0","ASUS_X018D_7.0","ASUS_Z00UD_5.0.2","SM-G925I_5.1.1","SM-G950U_7.0","D21AP_12.1.2","Lenovo TB3-710F_5.0.1","XT1033_4.4.2","HTC Desire 530_6.0.1","N69uAP_12.1.2","LG-D100_4.4.2","D20AP_11.3","SM-J530GM_7.0","SM-T113_4.4.4","D22AP_11.2.2","XT1022_5.1","S420_5.1","XT1021_5.1","SM-G930U_7.0","You L_7.0","ZTE BLADE L110_5.1","ASUS_X017D_7.1.1","E6883_7.1.1","D331pAP_12.0","HTC One M9_7.0","Redmi 6A_8.1.0","LG-D618_5.0.2","BLA-A09_8.0.0","D21AP_11.2.2","MS50M_5.1","SM-J710F_7.0","BGH Joy X5_5.1","Mi Note 3_7.1.1","E5803_7.1.1","BLU STUDIO X8 HD_4.4.2","H3223_8.0.0","SM-G928G_6.0.1","D101AP_11.1.1","TA-1039_8.1.0","N61AP_11.2","SM-G920P_7.0","SM-G950U1_7.0","ATU-LX3_8.0.0","SM-N9005_4.4.2","LM-G710_8.0.0","SM-G935U_8.0.0","F8332_8.0.0","D211AP_12.1.1","LG-D685_4.4.2","SM-J105H_5.1.1","F5121_7.1.1","2014819_4.4.4","HUAWEI LUA-L03_5.1","SM-J106B_6.0.1","ASUS_Z00LD_5.0.2","MS60_5.1","Lenovo A7010a48_5.1","D101AP_11.2","SM-G965U_8.0.0","N56AP_11.1.2","Moto Z (2)_7.1.1","MS50_4G_5.1","SM-G850M_5.0.2","SM-A320Y_7.0","Lenovo K33a48_6.0.1","SM-N920P_7.0","MI 5s Plus_7.0","5011A_7.0","SM-G930V_7.0","SM-N920G_6.0.1","SM-P585M_7.0","XT1039_5.1","C6503_5.1.1","E2053_4.4.4","SM-G930U_8.0.0","PRA-LX3_8.0.0","SM-J610G_8.1.0","G3226_8.0.0","5010G_6.0","MIX 2_7.0","Tablet_DL_3420_5.1.1","SM-G900FD_6.0.1","E5506_6.0","Ilium L1120_7.0","D2212_4.4.4","LG-K371_6.0","Ultra Live II_6.0","D22AP_11.2.1","SM-J415G_8.1.0","MI MAX_7.0","SM-J510FN_7.1.1","N51AP_11.1.2","N61AP_10.2","K93AP_9.3.5","LG-D722AR_5.0.2","E6553_7.1.1","SM-G360BT_4.4.4","E5343_6.0","MI 6_7.1.1","SM-T530_5.0.2","EML-L29_8.1.0","N53AP_11.0.3","BBB100-1_7.1.1","6039J_5.0.2","5085N_6.0","HTC 10_8.0.0","P106AP_9.3.5","K94AP_9.3.5","SM-J327T1_7.0","HTC U11_8.0.0","ASUS_X008DC_7.0","E5563_6.0","SM-G935T_7.0","BV8000Pro_7.0","E6683_7.1.1","ONEPLUS A6003_9","DIG-L03_6.0","SM-G357M_4.4.2","FLIX_5.1","GT-S6313T_4.1.2","SM-G900T_6.0.1","Twist XL_7.0","N56AP_10.2.1","LG-H960_6.0","SM-G920V_6.0.1","Pixel 2 XL_9","N51AP_12.1.2","Pure XR_6.0","ZTE E10Q_4.4.2","Le X820_6.0.1","N53AP_10.3.2","D101AP_10.3.2","SM-J720M_8.0.0","S60_7.0","HTC One A9s_6.0","BGH Joy V6_5.0.2","SM-G570F_7.0","SAMSUNG-SM-G935A_7.0","Advance 4.0 L3_6.0","N66AP_10.3.3","SM-P355M_7.1.1","CHC-U03_4.4.2","SM-G313M_4.4.2","N71AP_12.1.1","GT-N8000_4.1.2","8050G_5.1","LG-D105_4.4.2","SM-G935T_8.0.0","G3116_8.0.0","STUDIO M HD_5.1","MS55_5.1","SM-N915T_6.0.1","VKY-L09_8.0.0","SM-N910H_6.0.1","LG-H735_5.1.1","LG-D805_4.4.2","GT-P3110_4.1.2","ASUS_X017DA_7.1.1","LGMP260_7.0","SM-P555M_7.1.1","ASUS_X008DB_6.0","D101AP_10.2.1","SM-C5000_7.0","N71mAP_12.1.1","N51AP_10.2.1","SM-G130M_4.4.2","SM-N920V_7.0","Lenovo A6020a46_5.1.1","N69AP_10.3.3","LG-H815_5.1","SAMSUNG-SM-G935A_6.0.1","FRD-L04_7.0","BLADE A602_6.0","D21AP_11.2.1","Ultra Shadow_6.0","SM-T580_7.0","GO 2_7.0","LG-H540_6.0","VKY-L29_7.0","MIX_8.0.0","D201AP_12.1.1","N503_6.0","MI 5X_7.1.2","N841AP_12.1.2","RS988_7.0","D20AP_11.2.5","SM-G900H_5.0","Z981_6.0.1","D10AP_11.1.2","LG-D724_5.0.2","KIW-L24_6.0.1","POCOPHONE F1_8.1.0","ZTE Blade L5_5.1","5090I_7.0","Vivo XL2_7.0","VTR-L29_8.0.0","Neffos C5_5.1","LG-K530_7.0","MotoG3_7.1.2","D111AP_11.0.3","D321AP_12.1.2","HUAWEI G620_4.4.4","SM-N910V_6.0.1","LG-K520_6.0.1","N66mAP_12.1.2","LG-E615f_4.0.4","XT1254_6.0.1","N66AP_11.1.2","ASUS_Z002_4.4.2","BLADE V8_7.0","LG-D690n_4.4.2","SM-A500H_6.0.1","LG-D855_4.4.2","BLA-L09_8.0.0","Lenovo PB2-670Y_6.0","HUAWEI VNS-L53_6.0","SM-J500H_5.1.1","HTC Desire 626s_5.1","hi6210sft_6.0","HUAWEI P7-L12_4.4.2","LG-E410f_4.1.2","5017A_5.1","SM-G955U1_7.0","5012G_6.0","LG-X170fTV_5.0","XT1097_5.1","SM-N920T_7.0","LGMS210_7.0","SM-T230NT_4.4.2","LG-E415f_4.1.2","ONEPLUS A6000_9","SM-G960F_8.0.0","D20AP_12.1.2","LG-H630_5.0.2","MYA-L03_6.0","ADR9_7.0","SM-G920I_5.1.1","ASUS_X00LDA_8.1.0","Philips_S326_5.1","SM-G610F_8.1.0","SM-T230_4.4.2","BLU Studio Touch_6.0","N71AP_11.0.3","You_7.0","N61AP_11.1","BGH Joy Smart AXS II_4.4.4","LG-H870DS_7.0","SGH-I337M_5.0.1","Personal Huawei G620S_4.4.4","N61AP_10.1.1","HUAWEI NXT-L09_6.0","VIVO XL_6.0","LG-H542_6.0","Vivo 5R_6.0","5056A_6.0.1","D331pAP_12.1.1","ALP-L29_8.0.0","Redmi Pro_6.0","ZTE Blade V6 Plus_6.0","ZTE BLADE A310_6.0.1","Hisense U963_6.0","VKY-L29_8.0.0","SM-J327P_6.0.1","SM-G900V_5.0","GT-S6812B_4.1.2","HUAWEI KII-L23_5.1.1","SM-P550_7.1.1","D221AP_11.1.2","LG-H442_5.0.1","Ilium X710_6.0","N53AP_10.2","LG-H736_6.0","Studio C HD_6.0","LG-H870DS_8.0.0","K93aAP_9.3.5","N69uAP_10.3.3","E5606_5.1","TA-1028_8.0.0","M7-3G QUAD CORE_4.4.2","ASUS_X008D_7.0","J2aAP_9.3.5","ASUS_Z017D_8.0.0","LG-H635_5.0.2","ONEPLUS A5010_8.0.0","LG-E435f_4.1.2","Ultra Shine_7.0","HTC One_M8_6.0","iPhone_11.3.1","N61AP_10.3.1","J1AP_9.3.5","ASUS_X00DDA_6.0.1","HUAWEI TAG-L23_5.1","SM-G900M_4.4.2","NX551J_6.0.1","GT-S6790L_4.1.2","GT-P3100_4.1.2","SM-T531_4.4.2","ALE-L21_6.0","N53AP_11.1.1","N71mAP_11.0.3","D22AP_12.1.1","SM-G930P_8.0.0","SM-G800F_6.0.1","M4 SS4458_6.0.1","D211AP_11.1.2","SM-J700F_6.0.1","4009I_4.4.2","C2104_4.2.2","SM-G930T_8.0.0","LG-D805_5.0.2","SM-P350_6.0.1","5049E_7.0","Redmi 3_5.1.1","Moto G4 Plus_7.1.2","SM-G935V_6.0.1","D20AP_11.2.2","LG-H500_5.0.1","SM-G800H_5.1.1","EVA-L19_6.0","N71AP_10.2.1","LG-H850_6.0.1","D321AP_12.0.1","SM-J200H_5.1.1","LG-H520_5.0.2","D10AP_10.3.3","G4_6.0","D11AP_11.1.2","SM-G955N_4.4.2","G3312_7.0","LG-H340_5.0.1","SM-T211M_4.4.2","S430 Positivo Twist Mini_6.0","ONEPLUS A3003_8.0.0","SM-G930K_4.4.2","GT-I8190_4.1.2","Lenovo A1010a20_5.1","vernee_M5_7.0","Le X829_6.0.1","Studio XL 2_6.0","Lenovo A1000_5.0","SM-G930T_7.0","GT-I9300_4.1.2","GT-I9100_4.1.2","Philips S327_7.0","GT-S5312B_4.1.2","GT-S5312C_4.4.2","GT-I9500_4.4.2","Ultra Storm_6.0"
    };
  }


  private static final class Status{

    Map<String, Object> body = new HashMap<>();

    public Status(String status, String statusDetail) {
      this.body.put("status", status);
      this.body.put("status_detail", statusDetail);
    }

    public Status withMessage(String msg) {
      this.body.put("message", msg);
      return this;
    }

    public Status withCode(int code) {
      this.body.put("code", code);
      return this;
    }

    public static Status ok() {
      return new Status("processed", "processed");
    }

    public static Status reject(String detail) {
      return new Status("rejected", detail);
    }
  }
  private static JSONObject llenarJson() throws JSONException {
    JSONObject jsonObj = new JSONObject("{\"id\":1520644840,\"date_created\":\"2017-10-31T19:02:15.000-04:00\",\"date_closed\":\"2017-10-31T19:02:19.000-04:00\",\"last_updated\":\"2017-11-09T11:00:35.000-04:00\",\"feedback\":{\"sale\":null,\"purchase\":null},\"comments\":null,\"order_request\":{\"return\":null,\"change\":null},\"fulfilled\":true,\"manufacturing_ending_date\":null,\"pack_id\":null,\"mediations\":[],\"shipping\":{\"id\":26479823058,\"site_id\":\"MLA\",\"shipment_type\":\"shipping\",\"mode\":\"me2\",\"shipping_mode\":\"me2\",\"status\":\"delivered\",\"shipping_items\":[{\"id\":\"MLA659282089\",\"description\":\"Samsung Galaxy J1 Ace Libre 4g Lte 8gb 12 Gtia Techcel\",\"quantity\":1,\"dimensions\":\"10.0x10.0x15.0,650.0\"}],\"shipping_option\":{\"id\":483040746,\"shipping_method_id\":73328,\"name\":\"Normal a domicilio\",\"currency_id\":\"ARS\",\"cost\":0,\"delivery_type\":\"estimated\",\"list_cost\":184.99,\"estimated_schedule_limit\":{\"date\":null},\"estimated_handling_limit\":{\"date\":\"2017-11-01T00:00:00.000-03:00\"},\"estimated_delivery_final\":{\"date\":\"2017-12-11T00:00:00.000-03:00\",\"offset\":480},\"estimated_delivery_limit\":{\"date\":\"2017-11-24T00:00:00.000-03:00\",\"offset\":240},\"estimated_delivery_extended\":{\"date\":\"2017-11-14T00:00:00.000-03:00\",\"offset\":72},\"estimated_delivery_time\":{\"type\":\"known\",\"date\":\"2017-11-09T00:00:00.000-03:00\",\"unit\":\"hour\",\"offset\":{\"date\":null,\"shipping\":null},\"time_frame\":{\"from\":null,\"to\":null},\"pay_before\":null,\"shipping\":120,\"handling\":24,\"schedule\":null}},\"currency_id\":\"ARS\",\"receiver_address\":{\"id\":180910943,\"address_line\":\"Santa Fe SN\",\"street_name\":\"Santa Fe\",\"street_number\":\"SN\",\"comment\":null,\"zip_code\":\"5260\",\"city\":{\"id\":null,\"name\":\"recreo\"},\"state\":{\"id\":\"AR-K\",\"name\":\"Catamarca\"},\"country\":{\"id\":\"AR\",\"name\":\"Argentina\"},\"neighborhood\":{\"id\":null,\"name\":null},\"municipality\":{\"id\":null,\"name\":null},\"agency\":null,\"types\":null,\"latitude\":null,\"longitude\":null,\"geolocation_type\":null,\"receiver_name\":\"Cinthia Paola Gacitua\",\"receiver_phone\":\"3832406791\"},\"sender_address\":{\"id\":236346924,\"address_line\":\"Jose Ingenieros 2872\",\"street_name\":\"Jose Ingenieros\",\"street_number\":\"2872\",\"comment\":null,\"zip_code\":\"1643\",\"city\":{\"id\":null,\"name\":\"Beccar\"},\"state\":{\"id\":\"AR-B\",\"name\":\"Buenos Aires\"},\"country\":{\"id\":\"AR\",\"name\":\"Argentina\"},\"neighborhood\":{\"id\":null,\"name\":null},\"municipality\":{\"id\":null,\"name\":null},\"agency\":null,\"types\":[\"billing\",\"default_selling_address\",\"shipping\"],\"latitude\":-34.47,\"longitude\":-58.56,\"geolocation_type\":\"RANGE_INTERPOLATED\"},\"picking_type\":null,\"logistic_type\":\"cross_docking\",\"cost\":0,\"substatus\":null,\"date_created\":\"2017-10-31T19:02:16.000-04:00\",\"date_first_printed\":\"2017-11-01T08:48:32.000-04:00\",\"service_id\":422,\"receiver_id\":210094869,\"sender_id\":243450833,\"cost_components\":{\"special_discount\":0,\"loyal_discount\":0,\"compensation\":0}},\"pickup_id\":null,\"expiration_date\":\"2017-11-21T19:02:19.000-04:00\",\"status\":\"paid\",\"status_detail\":null,\"order_items\":[{\"item\":{\"id\":\"MLA659282089\",\"title\":\"Samsung Galaxy J1 Ace Libre 4g Lte 8gb 12 Gtia Techcel\",\"category_id\":\"MLA391862\",\"variation_id\":null,\"seller_custom_field\":null,\"variation_attributes\":[],\"warranty\":\"12 Meses por parte del fabricante\",\"condition\":\"new\"},\"quantity\":1,\"unit_price\":2699,\"full_unit_price\":2699,\"currency_id\":\"ARS\",\"manufacturing_days\":null},{\"item\":{\"id\":\"lal1234\",\"title\":\"Samsung aguante el s7 vieja\",\"category_id\":\"MLA391862\",\"variation_id\":null,\"seller_custom_field\":null,\"variation_attributes\":[],\"warranty\":\"12 Meses por parte del fabricante\",\"condition\":\"new\"},\"quantity\":1,\"unit_price\":2699,\"full_unit_price\":2699,\"currency_id\":\"ARS\",\"manufacturing_days\":null}],\"currency_id\":\"ARS\",\"buyer\":{\"id\":210094869,\"nickname\":\"ANGELIVANMOTENO\",\"email\":\"amoteno.z6s1hy+2-oge2tembwgq2dqnzz@mail.mercadolibre.com\",\"phone\":{\"area_code\":null,\"extension\":\"\",\"number\":\"3834011013\",\"verified\":false},\"alternative_phone\":{\"area_code\":\"\",\"extension\":\"\",\"number\":\"\"},\"first_name\":\"Angel Ivan\",\"last_name\":\"Moteno\",\"billing_info\":{\"doc_type\":\"DNI\",\"doc_number\":\"32415525\"}},\"seller\":{\"id\":243450833,\"nickname\":\"TECHCEL SA\",\"email\":\"ttechno.b3nsb3+2-oge2tembwgq2dqnzs@mail.mercadolibre.com\",\"phone\":{\"area_code\":null,\"extension\":\"\",\"number\":\"0111562624011\",\"verified\":false},\"alternative_phone\":{\"area_code\":\"\",\"extension\":\"\",\"number\":\"0111549600503\"},\"first_name\":\"Technorth S.A.\",\"last_name\":\"Technorth S.A.\"},\"payments\":[{\"id\":3103821518,\"order_id\":1520644840,\"payer_id\":210094869,\"collector\":{\"id\":243450833},\"card_id\":179467296,\"site_id\":\"MLA\",\"reason\":\"Samsung Galaxy J1 Ace Libre 4g Lte 8gb 12 Gtia Techcel\",\"payment_method_id\":\"naranja\",\"currency_id\":\"ARS\",\"installments\":6,\"issuer_id\":\"5\",\"atm_transfer_reference\":{\"company_id\":null,\"transaction_id\":null},\"coupon_id\":null,\"activation_uri\":null,\"operation_type\":\"regular_payment\",\"payment_type\":\"credit_card\",\"available_actions\":[\"refund\"],\"status\":\"approved\",\"status_code\":null,\"status_detail\":\"accredited\",\"transaction_amount\":2699,\"shipping_cost\":0,\"coupon_amount\":0,\"overpaid_amount\":0,\"total_paid_amount\":3084.42,\"installment_amount\":514.07,\"deferred_period\":null,\"date_approved\":\"2017-10-31T19:02:18.000-04:00\",\"authorization_code\":\"857360\",\"transaction_order_id\":null,\"date_created\":\"2017-10-31T19:02:16.000-04:00\",\"date_last_modified\":\"2017-10-31T19:02:20.000-04:00\"}],\"coupon\":{\"id\":null,\"amount\":0},\"tags\":[\"delivered\",\"paid\"],\"total_amount\":2699,\"total_amount_with_shipping\":2699,\"paid_amount\":2699}");

    return jsonObj;
  }
  public static String getStringToFind() {
    return ("2014819_4.4.4\n" +
        "2014819_5.1.1\n" +
        "4009A_4.4.2\n" +
        "4009E_4.4.2\n" +
        "4009I_4.4.2\n" +
        "4017F_5.1\n" +
        "4028E_4.4.2\n" +
        "4034E_6.0\n" +
        "4045A_5.0.2\n" +
        "4055J_6.0\n" +
        "5010E_6.0\n" +
        "5010G_6.0\n" +
        "5010S_6.0\n" +
        "5011A_7.0\n" +
        "5012G_6.0\n" +
        "5015A_5.1\n" +
        "5016J_5.1\n" +
        "5017A_5.1\n" +
        "5017E_5.1\n" +
        "5025G_5.1\n" +
        "5042A_4.4.4\n" +
        "5044O_6.0\n" +
        "5045A_6.0\n" +
        "5045J_6.0\n" +
        "5046G_7.0\n" +
        "5046J_6.0\n" +
        "5051J_6.0.1\n" +
        "5054S_5.1.1\n" +
        "5056A_6.0.1\n" +
        "5080A_6.0\n" +
        "5085J_6.0\n" +
        "5085N_6.0\n" +
        "5090I_7.0\n" +
        "5095I_6.0\n" +
        "5116J_5.1\n" +
        "6039A_5.0.2\n" +
        "6039J_5.0.2\n" +
        "6045B_5.0.2\n" +
        "6055B_6.0.1\n" +
        "704-G_6.0\n" +
        "7055A_4.4.2\n" +
        "8050E_5.1\n" +
        "8050G_5.1\n" +
        "8056_4.4.2\n" +
        "8063_6.0\n" +
        "8080_5.0.1\n" +
        "9008A_7.0\n" +
        "9008J_7.0\n" +
        "9008N_7.0\n" +
        "A0001_6.0.1\n" +
        "A724G_5.1.1\n" +
        "A96_5.1\n" +
        "AD570_5.1\n" +
        "ADS1_6.0\n" +
        "Advance4.0L3_6.0\n" +
        "Advance4.0M_6.0\n" +
        "AGS-W09_7.0\n" +
        "ALCATELONETOUCH7040E_4.2.2\n" +
        "Alcatel_4060A_5.1.1\n" +
        "Alcatel_5054O_5.1.1\n" +
        "Alcatel_5098O_6.0.1\n" +
        "ALE-L21_5.0.1\n" +
        "ALE-L21_6.0\n" +
        "ALE-L23_5.0\n" +
        "ALE-L23_5.0.1\n" +
        "ALE-L23_6.0\n" +
        "ALP-L09_8.0.0\n" +
        "Alpha_7.0\n" +
        "ASUS_A007_6.0.1\n" +
        "ASUS_T00J_4.4.2\n" +
        "ASUS_T00J_5.0\n" +
        "ASUS_X008DB_6.0\n" +
        "ASUS_X008DB_7.0\n" +
        "ASUS_X008DC_7.0\n" +
        "ASUS_X008D_7.0\n" +
        "ASUS_X00ADA_6.0.1\n" +
        "ASUS_X00DDA_6.0.1\n" +
        "ASUS_X00DDA_7.1.1\n" +
        "ASUS_X00DD_7.1.1\n" +
        "ASUS_X00ID_7.1.1\n" +
        "ASUS_X00LD_7.1.1\n" +
        "ASUS_X013D_5.1.1\n" +
        "ASUS_X014D_5.1.1\n" +
        "ASUS_Z002_4.4.2\n" +
        "ASUS_Z002_5.0\n" +
        "ASUS_Z00AD_5.0\n" +
        "ASUS_Z00AD_6.0.1\n" +
        "ASUS_Z00A_7.1.2\n" +
        "ASUS_Z00LD_5.0.2\n" +
        "ASUS_Z00LD_6.0.1\n" +
        "ASUS_Z00TD_6.0.1\n" +
        "ASUS_Z00UD_5.0.2\n" +
        "ASUS_Z00UD_6.0.1\n" +
        "ASUS_Z00VD_5.1\n" +
        "ASUS_Z00XS_5.0\n" +
        "ASUS_Z00XS_6.0.1\n" +
        "ASUS_Z00YD_5.1\n" +
        "ASUS_Z011D_5.0.2\n" +
        "ASUS_Z011D_6.0.1\n" +
        "ASUS_Z012DA_7.0\n" +
        "ASUS_Z012DC_7.0\n" +
        "ASUS_Z012DC_8.0.0\n" +
        "ASUS_Z016D_7.0\n" +
        "ASUS_Z017DC_7.0\n" +
        "ASUS_Z017DC_8.0.0\n" +
        "ASUS_Z017D_7.0\n" +
        "ASUS_Z01BDC_7.1.1\n" +
        "ASUS_Z01FD_7.0\n" +
        "ASUS_Z01HD_7.1.1\n" +
        "ASUS_Z01KD_7.1.1\n" +
        "ASUS_Z01KD_8.0.0\n" +
        "ASUS_Z01MD_7.1.1\n" +
        "B1-730_4.4.2\n" +
        "B1-770_5.0.1\n" +
        "BAC-L03_7.0\n" +
        "BBB100-1_7.1.1\n" +
        "BG2-W09_6.0\n" +
        "BGHJoySmartAXSIID_4.4.4\n" +
        "BGHJoySmartAXSII_4.4.4\n" +
        "BGHJoyV6_5.0.2\n" +
        "BGHJoyX5_5.1\n" +
        "BladeA460_5.1.1\n" +
        "BladeA510_6.0\n" +
        "BLADEA602_6.0\n" +
        "BladeL2Plus_4.4.2\n" +
        "BladeL2_4.4.2\n" +
        "BladeL5_5.1\n" +
        "BLADEL7_6.0\n" +
        "BladeV580_5.1\n" +
        "BladeV6Plus_6.0\n" +
        "BladeV6_5.0.2\n" +
        "BLADEV7_6.0\n" +
        "BLADEV8SE_7.0\n" +
        "BLADEV8_7.0\n" +
        "BLL-L23_6.0\n" +
        "BLL-L23_7.0\n" +
        "BLN-L24_7.0\n" +
        "BLUADVANCE4.0L2_6.0\n" +
        "BLUADVANCE4.0L_4.4.2\n" +
        "BLUADVANCE4.0_4.2.2\n" +
        "BLUAdvance5.0_5.1\n" +
        "BlubooS1_7.0\n" +
        "BLUDASHM2_6.0\n" +
        "BLUDASHM_5.1\n" +
        "BLUDASHX2_6.0\n" +
        "BLUDASHX_5.1\n" +
        "BLUENERGYM_6.0\n" +
        "BLUENERGYXPLUS2_6.0\n" +
        "BLUENERGYXPLUS_5.0\n" +
        "BLUGRAND5.5HD_6.0\n" +
        "BLULIFEXL_5.1\n" +
        "BLULIFEXL_5.1.1\n" +
        "BLUNEOXMINI_6.0\n" +
        "BLUR1HD_6.0\n" +
        "BLUSTUDIO5.0CHD_4.4.2\n" +
        "BLUSTUDIO5.0C_4.4.2\n" +
        "BLUSTUDIOC5+5LTE_5.1.1\n" +
        "BLUSTUDIOC5+5_5.0\n" +
        "BLUSTUDIOCHD_5.1\n" +
        "BLUSTUDIOC_5.0\n" +
        "BLUSTUDIOG2_6.0\n" +
        "BLUSTUDIOG_4.4.2\n" +
        "BLUSTUDIOONE_5.1\n" +
        "BLUSTUDIOSELFIE2_6.0\n" +
        "BLUStudioTouch_6.0\n" +
        "BLUSTUDIOX8HD_4.4.2\n" +
        "BLUVIVOAIRLTE_5.0.2\n" +
        "BucareY330-U05_4.2.2\n" +
        "BV8000Pro_7.0\n" +
        "C1604_4.1.1\n" +
        "C1904_4.3\n" +
        "C2004_4.3\n" +
        "C2104_4.2.2\n" +
        "C2304_4.2.2\n" +
        "C5303_4.3\n" +
        "C6502_5.0.2\n" +
        "C6503_5.1.1\n" +
        "C6603_5.1.1\n" +
        "C6843_5.1.1\n" +
        "C6903_5.1.1\n" +
        "C6906_5.1.1\n" +
        "C6943_5.0.2\n" +
        "C6943_5.1.1\n" +
        "CAM-L03_6.0\n" +
        "CAM-L23_6.0\n" +
        "CHC-U03_4.4.2\n" +
        "CRO-L03_6.0\n" +
        "CX9006_5.0.1\n" +
        "CX940_5.1\n" +
        "D101AP_10.1.1\n" +
        "D101AP_10.2\n" +
        "D101AP_10.2.1\n" +
        "D101AP_10.3.1\n" +
        "D101AP_10.3.2\n" +
        "D101AP_10.3.3\n" +
        "D101AP_11.0\n" +
        "D101AP_11.0.1\n" +
        "D101AP_11.0.2\n" +
        "D101AP_11.0.3\n" +
        "D101AP_11.1\n" +
        "D101AP_11.1.1\n" +
        "D101AP_11.1.2\n" +
        "D101AP_11.2\n" +
        "D101AP_11.2.1\n" +
        "D101AP_11.2.2\n" +
        "D101AP_11.2.5\n" +
        "D101AP_11.2.6\n" +
        "D101AP_11.3\n" +
        "D10AP_10.2.1\n" +
        "D10AP_10.3.2\n" +
        "D10AP_10.3.3\n" +
        "D10AP_11.0.1\n" +
        "D10AP_11.0.3\n" +
        "D10AP_11.1\n" +
        "D10AP_11.1.1\n" +
        "D10AP_11.1.2\n" +
        "D10AP_11.2\n" +
        "D10AP_11.2.1\n" +
        "D10AP_11.2.2\n" +
        "D10AP_11.2.5\n" +
        "D10AP_11.2.6\n" +
        "D111AP_10.2\n" +
        "D111AP_10.2.1\n" +
        "D111AP_10.3.1\n" +
        "D111AP_10.3.2\n" +
        "D111AP_10.3.3\n" +
        "D111AP_11.0\n" +
        "D111AP_11.0.1\n" +
        "D111AP_11.0.2\n" +
        "D111AP_11.0.3\n" +
        "D111AP_11.1\n" +
        "D111AP_11.1.1\n" +
        "D111AP_11.1.2\n" +
        "D111AP_11.2\n" +
        "D111AP_11.2.1\n" +
        "D111AP_11.2.2\n" +
        "D111AP_11.2.5\n" +
        "D111AP_11.2.6\n" +
        "D111AP_11.3\n" +
        "D11AP_10.3.3\n" +
        "D11AP_11.0.3\n" +
        "D11AP_11.1\n" +
        "D11AP_11.1.1\n" +
        "D11AP_11.1.2\n" +
        "D11AP_11.2\n" +
        "D11AP_11.2.1\n" +
        "D11AP_11.2.2\n" +
        "D11AP_11.2.5\n" +
        "D11AP_11.2.6\n" +
        "D2004_4.4.2\n" +
        "D201AP_11.0\n" +
        "D201AP_11.0.2\n" +
        "D201AP_11.0.3\n" +
        "D201AP_11.1\n" +
        "D201AP_11.1.1\n" +
        "D201AP_11.1.2\n" +
        "D201AP_11.2\n" +
        "D201AP_11.2.1\n" +
        "D201AP_11.2.2\n" +
        "D201AP_11.2.5\n" +
        "D201AP_11.2.6\n" +
        "D20AP_11.0.3\n" +
        "D20AP_11.1.2\n" +
        "D20AP_11.2\n" +
        "D20AP_11.2.1\n" +
        "D20AP_11.2.2\n" +
        "D20AP_11.2.5\n" +
        "D20AP_11.2.6\n" +
        "D2104_4.4.2\n" +
        "D2114_4.4.2\n" +
        "D211AP_11.0\n" +
        "D211AP_11.0.2\n" +
        "D211AP_11.0.3\n" +
        "D211AP_11.1\n" +
        "D211AP_11.1.1\n" +
        "D211AP_11.1.2\n" +
        "D211AP_11.2\n" +
        "D211AP_11.2.1\n" +
        "D211AP_11.2.2\n" +
        "D211AP_11.2.5\n" +
        "D211AP_11.2.6\n" +
        "D21AP_11.0.3\n" +
        "D21AP_11.1.2\n" +
        "D21AP_11.2\n" +
        "D21AP_11.2.1\n" +
        "D21AP_11.2.2\n" +
        "D21AP_11.2.5\n" +
        "D21AP_11.2.6\n" +
        "D2212_4.4.4\n" +
        "D221AP_11.0.1\n" +
        "D221AP_11.1\n" +
        "D221AP_11.1.1\n" +
        "D221AP_11.1.2\n" +
        "D221AP_11.2\n" +
        "D221AP_11.2.1\n" +
        "D221AP_11.2.2\n" +
        "D221AP_11.2.5\n" +
        "D221AP_11.2.6\n" +
        "D221AP_11.3\n" +
        "D2243_4.4.4\n" +
        "D22AP_11.1.2\n" +
        "D22AP_11.2\n" +
        "D22AP_11.2.1\n" +
        "D22AP_11.2.2\n" +
        "D22AP_11.2.5\n" +
        "D22AP_11.2.6\n" +
        "D2305_4.4.4\n" +
        "D2306_4.4.4\n" +
        "D2306_5.1.1\n" +
        "D2403_4.4.4\n" +
        "D2403_5.1.1\n" +
        "D5106_4.4.4\n" +
        "D5306_5.1.1\n" +
        "D5322_4.4.3\n" +
        "D5322_5.0.2\n" +
        "D5322_5.1.1\n" +
        "D5503_5.1.1\n" +
        "D5803_6.0.1\n" +
        "D5833_6.0.1\n" +
        "D6503_6.0.1\n" +
        "D6543_6.0.1\n" +
        "D6603_6.0.1\n" +
        "D6633_6.0.1\n" +
        "D6643_5.0.2\n" +
        "D6643_6.0.1\n" +
        "D6653_6.0.1\n" +
        "DashL3_6.0\n" +
        "DashX2_6.0\n" +
        "DashXL_6.0\n" +
        "DIG-L03_6.0\n" +
        "DIG-L23_6.0\n" +
        "E2053_4.4.4\n" +
        "E2104_4.4.4\n" +
        "E2124_4.4.4\n" +
        "E2306_5.0\n" +
        "E2306_6.0.1\n" +
        "E2363_5.0\n" +
        "E2363_6.0.1\n" +
        "E5306_6.0\n" +
        "E5343_6.0\n" +
        "E5506_5.1\n" +
        "E5506_6.0\n" +
        "E5563_6.0\n" +
        "E5606_5.1\n" +
        "E5606_6.0\n" +
        "E5643_6.0\n" +
        "E5653_6.0\n" +
        "E5803_7.1.1\n" +
        "E5823_7.1.1\n" +
        "E6533_7.1.1\n" +
        "E6553_7.1.1\n" +
        "E6603_7.1.1\n" +
        "E6633_7.1.1\n" +
        "E6653_7.1.1\n" +
        "E6683_7.1.1\n" +
        "E6833_7.1.1\n" +
        "E6853_7.1.1\n" +
        "E6883_7.1.1\n" +
        "EnergyX2_5.1\n" +
        "EVA-L09_6.0\n" +
        "EVA-L09_7.0\n" +
        "EVA-L19_6.0\n" +
        "EVA-L19_7.0\n" +
        "F3113_6.0\n" +
        "F3113_7.0\n" +
        "F3116_6.0\n" +
        "F3116_7.0\n" +
        "F3213_6.0\n" +
        "F3213_7.0\n" +
        "F3216_7.0\n" +
        "F3313_6.0\n" +
        "F5121_7.0\n" +
        "F5121_7.1.1\n" +
        "F5121_8.0.0\n" +
        "F5122_7.1.1\n" +
        "F5321_7.1.1\n" +
        "F8331_7.1.1\n" +
        "F8331_8.0.0\n" +
        "F8332_7.1.1\n" +
        "F8332_8.0.0\n" +
        "FL8006_5.1.1\n" +
        "FLIX_5.1\n" +
        "FRD-L04_7.0\n" +
        "Fuego5.0+_6.0\n" +
        "G3116_7.0\n" +
        "G3123_7.0\n" +
        "G3223_7.0\n" +
        "G3226_7.0\n" +
        "G3312_7.0\n" +
        "G3313_7.0\n" +
        "G4_6.0\n" +
        "g4_6.1\n" +
        "g5Plus_6.0\n" +
        "G620S-L03_4.4.4\n" +
        "G8141_8.0.0\n" +
        "G8142_8.0.0\n" +
        "G8341_8.0.0\n" +
        "GO2_7.0\n" +
        "GrandM_6.0\n" +
        "GT-I8190L_4.1.2\n" +
        "GT-I8190N_4.1.2\n" +
        "GT-I8190_4.1.2\n" +
        "GT-I8200L_4.2.2\n" +
        "GT-I8200N_4.2.2\n" +
        "GT-I8200_4.2.2\n" +
        "GT-I8260L_4.1.2\n" +
        "GT-I8262B_4.1.2\n" +
        "GT-I8550L_4.1.2\n" +
        "GT-I8552B_4.1.2\n" +
        "GT-I9060C_4.4.4\n" +
        "GT-I9060I_4.4.4\n" +
        "GT-I9060L_4.2.2\n" +
        "GT-I9060M_4.4.4\n" +
        "GT-I9063T_4.2.2\n" +
        "GT-I9070_4.1.2\n" +
        "GT-I9080L_4.2.2\n" +
        "GT-I9082L_4.1.2\n" +
        "GT-I9082L_4.2.2\n" +
        "GT-I9100_4.0.3\n" +
        "GT-I9100_4.1.2\n" +
        "GT-I9152_4.2.2\n" +
        "GT-I9190_4.2.2\n" +
        "GT-I9190_4.4.2\n" +
        "GT-I9192_4.2.2\n" +
        "GT-I9192_4.4.2\n" +
        "GT-I9195L_4.4.2\n" +
        "GT-I9195_4.2.2\n" +
        "GT-I9195_4.4.2\n" +
        "GT-I9200_4.4.2\n" +
        "GT-I9295_5.0.1\n" +
        "GT-I9300I_4.4.4\n" +
        "GT-I9300_4.1.2\n" +
        "GT-I9300_4.3\n" +
        "GT-I9301I_4.4.2\n" +
        "GT-I9500_4.4.2\n" +
        "GT-I9500_5.0.1\n" +
        "GT-I9505_4.4.2\n" +
        "GT-I9505_5.0.1\n" +
        "GT-I9505_7.1.2\n" +
        "GT-I9515L_4.4.2\n" +
        "GT-I9515L_5.0.1\n" +
        "GT-N5100_4.4.2\n" +
        "GT-N5110_4.4.2\n" +
        "GT-N7100_4.3\n" +
        "GT-N7100_4.4.2\n" +
        "GT-N8000_4.1.2\n" +
        "GT-N8010_4.1.2\n" +
        "GT-P3100_4.0.4\n" +
        "GT-P3100_4.1.2\n" +
        "GT-P3110_4.1.2\n" +
        "GT-P5100_4.1.2\n" +
        "GT-P5110_4.1.2\n" +
        "GT-P5110_4.2.2\n" +
        "GT-P5200_4.2.2\n" +
        "GT-P5210_4.2.2\n" +
        "GT-S5283B_4.1.2\n" +
        "GT-S5301B_4.0.4\n" +
        "GT-S5301L_4.0.4\n" +
        "GT-S5303B_4.0.4\n" +
        "GT-S5310B_4.1.2\n" +
        "GT-S5310C_4.4.2\n" +
        "GT-S5312B_4.1.2\n" +
        "GT-S5312C_4.4.2\n" +
        "GT-S6293T_4.1.2\n" +
        "GT-S6313T_4.1.2\n" +
        "GT-S6790L_4.1.2\n" +
        "GT-S6810B_4.1.2\n" +
        "GT-S6810L_4.1.2\n" +
        "GT-S6812B_4.1.2\n" +
        "GT-S7262_4.1.2\n" +
        "GT-S7273T_4.2.2\n" +
        "GT-S7275B_4.2.2\n" +
        "GT-S7390L_4.1.2\n" +
        "GT-S7392L_4.1.2\n" +
        "GT-S7560M_4.0.4\n" +
        "GT-S7562L_4.0.4\n" +
        "GT-S7582L_4.2.2\n" +
        "GT-S7582_4.2.2\n" +
        "HDT-7427G_5.1\n" +
        "HDT-7427G_6.0\n" +
        "hi6210sft_6.0\n" +
        "HisenseF20_6.0.1\n" +
        "HisenseF23_7.0\n" +
        "HisenseL675_6.0\n" +
        "HisenseU963_6.0\n" +
        "HTC10_7.0\n" +
        "HTCDesire10lifestyle_6.0.1\n" +
        "HTCDesire530_6.0.1\n" +
        "HTCDesire626s_5.1\n" +
        "HTCDesire650_6.0.1\n" +
        "HTCOneA9s_6.0\n" +
        "HTCOneA9_7.0\n" +
        "HTCOneM9_6.0\n" +
        "HTCOneM9_7.0\n" +
        "HTCOne_5.0.2\n" +
        "HTCOne_M8_6.0\n" +
        "HTCU11_7.1.1\n" +
        "HUAWEIALE-L04_5.1\n" +
        "HUAWEICUN-L03_5.1\n" +
        "HUAWEIG620_4.4.4\n" +
        "HUAWEIG7-L03_4.4.4\n" +
        "HUAWEIGRA-L09_6.0\n" +
        "HUAWEIKII-L23_5.1.1\n" +
        "HUAWEILUA-L03_5.1\n" +
        "HUAWEIMT7-L09_4.4.2\n" +
        "HUAWEINXT-L09_6.0\n" +
        "HUAWEINXT-L09_7.0\n" +
        "HUAWEINXT-L29_6.0\n" +
        "HUAWEIP6-U06_4.2.2\n" +
        "HUAWEIP7-L12_4.4.2\n" +
        "HUAWEIRIO-L03_5.1\n" +
        "HUAWEIRIO-L03_6.0.1\n" +
        "HUAWEISCL-L03_5.1.1\n" +
        "HUAWEITAG-L13_5.1\n" +
        "HUAWEITAG-L23_5.1\n" +
        "HUAWEIVNS-L23_6.0\n" +
        "HUAWEIVNS-L23_7.0\n" +
        "HUAWEIVNS-L31_7.0\n" +
        "HUAWEIVNS-L53_6.0\n" +
        "HUAWEIVNS-L53_7.0\n" +
        "HUAWEIY330-U05_4.2.2\n" +
        "HUAWEIY550-L03_4.4.4\n" +
        "HUAWEIY550_4.4.4\n" +
        "HUAWEIY560-L03_5.1.1\n" +
        "HUAWEIY625-U43_4.4.2\n" +
        "HUAWEI_6.0.1\n" +
        "HY1-5085_5.1\n" +
        "IliumL1120_7.0\n" +
        "IliumL910_6.0\n" +
        "IliumLT500_5.1\n" +
        "IliumX510_6.0\n" +
        "IliumX710_6.0\n" +
        "iPhone_10.3.3\n" +
        "iPhone_11.0.3\n" +
        "iPhone_11.1.1\n" +
        "iPhone_11.1.2\n" +
        "iPhone_11.2\n" +
        "iPhone_11.2.1\n" +
        "iPhone_9.3.5\n" +
        "J127AP_11.2.1\n" +
        "J127AP_11.2.2\n" +
        "J127AP_11.2.5\n" +
        "J1AP_9.3.5\n" +
        "J2aAP_9.3.5\n" +
        "J71AP_10.3.3\n" +
        "J71AP_11.1.2\n" +
        "J71AP_11.2.1\n" +
        "J71AP_11.2.2\n" +
        "J71AP_11.2.5\n" +
        "J72AP_11.2.1\n" +
        "J7Prime_5.1\n" +
        "J81AP_11.1.2\n" +
        "J81AP_11.2.1\n" +
        "J81AP_11.2.2\n" +
        "J81AP_11.2.5\n" +
        "J81AP_11.2.6\n" +
        "J85AP_10.3.3\n" +
        "J85AP_11.1.2\n" +
        "J85AP_11.2.1\n" +
        "J85AP_11.2.5\n" +
        "J96AP_11.2.1\n" +
        "J96AP_11.2.5\n" +
        "JOY_6.0\n" +
        "K6000Plus_7.0\n" +
        "K93aAP_9.3.5\n" +
        "K93AP_9.3.5\n" +
        "K94AP_9.3.5\n" +
        "KavakY625-U03_4.4.2\n" +
        "KIICAAMIX_7.0\n" +
        "KING_6.0\n" +
        "KISC341_4.4.2\n" +
        "KIW-L24_6.0.1\n" +
        "LenovoA1000_5.0\n" +
        "LenovoA1010a20_5.1\n" +
        "LenovoA2016a40_6.0\n" +
        "LenovoA2016b30_6.0\n" +
        "LenovoA6020a40_5.1.1\n" +
        "LenovoA6020a46_5.1.1\n" +
        "LenovoA6020l36_5.1.1\n" +
        "LenovoA6020l36_6.0.1\n" +
        "LenovoA6020l37_5.1.1\n" +
        "LenovoA7010a48_5.1\n" +
        "LenovoA7010a48_6.0\n" +
        "LenovoA806_4.4.2\n" +
        "LenovoK10a40_6.0\n" +
        "LenovoK33a48_6.0.1\n" +
        "LenovoK33a48_7.0\n" +
        "LenovoK33b36_6.0.1\n" +
        "LenovoK33b36_7.0\n" +
        "LenovoK53b36_6.0.1\n" +
        "LenovoK53b36_7.0\n" +
        "LenovoP2a42_7.0\n" +
        "LenovoPB1-750M_6.0.1\n" +
        "LenovoPB2-650Y_6.0\n" +
        "LenovoPB2-670Y_6.0\n" +
        "LenovoTB-7703X_6.0.1\n" +
        "LenovoTB3-710F_5.0.1\n" +
        "LeX520_6.0.1\n" +
        "LEX626_6.0\n" +
        "LeX820_6.0.1\n" +
        "LeX829_6.0.1\n" +
        "LG-D100_4.4.2\n" +
        "LG-D105_4.4.2\n" +
        "LG-D107_4.4.2\n" +
        "LG-D125_4.4.2\n" +
        "LG-D157f_4.4.2\n" +
        "LG-D175f_4.4.2\n" +
        "LG-D227_4.4.2\n" +
        "LG-D285_4.4.2\n" +
        "LG-D295_4.4.2\n" +
        "LG-D325_4.4.2\n" +
        "LG-D337_4.4.2\n" +
        "LG-D337_5.0.2\n" +
        "LG-D375AR_4.4.2\n" +
        "LG-D385_4.4.2\n" +
        "LG-D390AR_4.4.4\n" +
        "LG-D410_4.4.2\n" +
        "LG-D410_5.0.2\n" +
        "LG-D610AR_4.4.2\n" +
        "LG-D618_4.4.2\n" +
        "LG-D618_5.0.2\n" +
        "LG-D625_4.4.2\n" +
        "LG-D680_4.4.2\n" +
        "LG-D681_4.1.2\n" +
        "LG-D681_4.4.2\n" +
        "LG-D685_4.4.2\n" +
        "LG-D690n_4.4.2\n" +
        "LG-D690n_5.0.2\n" +
        "LG-D690_4.4.2\n" +
        "LG-D690_5.0.2\n" +
        "LG-D693AR_4.4.2\n" +
        "LG-D693n_4.4.2\n" +
        "LG-D693n_5.0.2\n" +
        "LG-D722AR_4.4.2\n" +
        "LG-D722AR_5.0.2\n" +
        "LG-D722_5.0.2\n" +
        "LG-D724_4.4.2\n" +
        "LG-D724_5.0.2\n" +
        "LG-D800_4.4.2\n" +
        "LG-D805_4.2.2\n" +
        "LG-D805_4.4.2\n" +
        "LG-D805_5.0.2\n" +
        "LG-D806_4.2.2\n" +
        "LG-D806_5.0.2\n" +
        "LG-D851_6.0\n" +
        "LG-D855_4.4.2\n" +
        "LG-D855_5.0\n" +
        "LG-D855_6.0\n" +
        "LG-D956_4.2.2\n" +
        "LG-E410f_4.1.2\n" +
        "LG-E415f_4.1.2\n" +
        "LG-E425f_4.1.2\n" +
        "LG-E435f_4.1.2\n" +
        "LG-E455f_4.1.2\n" +
        "LG-E467f_4.1.2\n" +
        "LG-E470f_4.1.2\n" +
        "LG-E475f_4.1.2\n" +
        "LG-E612f_4.0.3\n" +
        "LG-E615f_4.0.4\n" +
        "LG-E615_4.0.4\n" +
        "LG-E977_4.4.2\n" +
        "LG-H221AR_4.4.2\n" +
        "LG-H221_4.4.2\n" +
        "LG-H222_4.4.2\n" +
        "LG-H320_5.0.1\n" +
        "LG-H326_5.0.1\n" +
        "LG-H340AR_5.0.1\n" +
        "LG-H340_5.0.1\n" +
        "LG-H342_5.0.1\n" +
        "LG-H420_5.0.1\n" +
        "LG-H422_5.0.1\n" +
        "LG-H440AR_5.0.1\n" +
        "LG-H442_5.0.1\n" +
        "LG-H500_5.0.1\n" +
        "LG-H502_5.0.1\n" +
        "LG-H520_5.0.2\n" +
        "LG-H522_5.0.2\n" +
        "LG-H540_5.0.2\n" +
        "LG-H540_6.0\n" +
        "LG-H542_6.0\n" +
        "LG-H630_5.0.2\n" +
        "LG-H630_6.0\n" +
        "LG-H635_5.0.2\n" +
        "LG-H635_6.0\n" +
        "LG-H650_5.1.1\n" +
        "LG-H650_6.0\n" +
        "LG-H735_5.1.1\n" +
        "LG-H735_6.0\n" +
        "LG-H736_6.0\n" +
        "LG-H815_5.1\n" +
        "LG-H815_6.0\n" +
        "LG-H818_5.1\n" +
        "LG-H818_6.0\n" +
        "LG-H840_6.0.1\n" +
        "LG-H840_7.0\n" +
        "LG-H850_6.0.1\n" +
        "LG-H850_7.0\n" +
        "LG-H860_7.0\n" +
        "LG-H870DS_7.0\n" +
        "LG-H870_7.0\n" +
        "LG-H955_5.1.1\n" +
        "LG-H955_6.0.1\n" +
        "LG-H960_6.0\n" +
        "LG-H990_7.0\n" +
        "LG-K120_5.1.1\n" +
        "LG-K121_5.1.1\n" +
        "LG-K130_5.1.1\n" +
        "LG-K200_6.0.1\n" +
        "LG-K220_6.0.1\n" +
        "LG-K240_6.0.1\n" +
        "LG-K350_6.0\n" +
        "LG-K371_6.0\n" +
        "LG-K410_5.0.2\n" +
        "LG-K430_6.0\n" +
        "LG-K500_6.0.1\n" +
        "LG-K520_6.0.1\n" +
        "LG-K530_6.0.1\n" +
        "LG-K530_7.0\n" +
        "LG-K580_6.0\n" +
        "LG-M154_6.0.1\n" +
        "LG-M250_7.0\n" +
        "LG-M320_7.0\n" +
        "LG-M400_7.0\n" +
        "LG-M700_7.1.1\n" +
        "LG-P712_4.1.2\n" +
        "LG-P714_4.1.2\n" +
        "LG-P715_4.1.2\n" +
        "LG-P716_4.1.2\n" +
        "LG-P768_4.0.4\n" +
        "LG-P875h_4.1.2\n" +
        "LG-V500_4.4.2\n" +
        "LG-V700_5.0.2\n" +
        "LG-X165g_5.0\n" +
        "LG-X170fTV_5.0\n" +
        "LG-X180g_5.1\n" +
        "LG-X210_5.1\n" +
        "LG-X220_5.1\n" +
        "LG-X230_6.0\n" +
        "LG-X240_6.0\n" +
        "LGLS755_6.0.1\n" +
        "LGMP260_7.0\n" +
        "LGMS210_7.0\n" +
        "LGMS330_5.1.1\n" +
        "LGUS991_6.0\n" +
        "LifeOneX2Mini_6.0.1\n" +
        "LifeOneX2_6.0.1\n" +
        "LifeOneX_6.0\n" +
        "LT26i_4.1.2\n" +
        "m2note_5.1\n" +
        "M4SS4456_5.1.1\n" +
        "M4SS4458_6.0.1\n" +
        "M7-3GQUADCORE_4.4.2\n" +
        "M8Pro_6.0\n" +
        "MG500_5.0.2\n" +
        "MHA-AL00_7.0\n" +
        "MHA-L09_7.0\n" +
        "MHA-L29_7.0\n" +
        "MHA-L29_8.0.0\n" +
        "MI5sPlus_7.0\n" +
        "MI5s_6.0.1\n" +
        "MI5s_7.0\n" +
        "MI5X_7.1.2\n" +
        "MI5_7.0\n" +
        "MI6_7.1.1\n" +
        "MI6_8.0.0\n" +
        "MiA1_7.1.2\n" +
        "MiA1_8.0.0\n" +
        "MIMAX2_7.1.1\n" +
        "MIMAX_6.0.1\n" +
        "MIMAX_7.0\n" +
        "MiMIX2_7.1.1\n" +
        "MiNote2_6.0.1\n" +
        "MiNote2_7.0\n" +
        "MIX2_7.0\n" +
        "MIX_7.0\n" +
        "MotoCPlus_7.0\n" +
        "MotoC_7.0\n" +
        "MotoE(4)Plus_7.1.1\n" +
        "MotoE(4)_7.1.1\n" +
        "MotoE2(4G-LTE)_5.0.2\n" +
        "MotoE2(4G-LTE)_5.1\n" +
        "MotoE2(4G-LTE)_6.0\n" +
        "MotoE2_5.1\n" +
        "MotoG(4)_6.0.1\n" +
        "MotoG(4)_7.0\n" +
        "MotoG(5)Plus_7.0\n" +
        "MotoG(5)_7.0\n" +
        "MotoG(5S)Plus_7.1.1\n" +
        "MotoG(5S)_7.1.1\n" +
        "MotoG2014_7.1.2\n" +
        "MotoG3-TE_6.0\n" +
        "MotoG3-TE_6.0.1\n" +
        "MotoG3_5.1.1\n" +
        "MotoG3_6.0\n" +
        "MotoG3_6.0.1\n" +
        "MotoG3_7.1.2\n" +
        "MotoG4Plus_7.1.2\n" +
        "MotoG4_7.1.2\n" +
        "MotoGPlay_6.0.1\n" +
        "MotoGPlay_7.1.1\n" +
        "MotoGPlay_7.1.2\n" +
        "MotoG_7.1.2\n" +
        "motox4_7.1.1\n" +
        "motox4_8.0.0\n" +
        "MotoXPlay_7.1.1\n" +
        "MotoZ(2)_7.1.1\n" +
        "MotoZ(2)_8.0.0\n" +
        "MotoZ2Play_7.1.1\n" +
        "MS40S_6.0\n" +
        "MS40_4.4.3\n" +
        "MS45S_5.1\n" +
        "MS45S_A6_6.0\n" +
        "MS5.V2_4.4.2\n" +
        "MS50M_5.1\n" +
        "MS50S_6.0\n" +
        "MS50_4G_5.1\n" +
        "MS50_5.0.2\n" +
        "MS55_5.1\n" +
        "MS60_5.1\n" +
        "MUV_6.0\n" +
        "MYA-L03_6.0\n" +
        "MYA-L13_6.0\n" +
        "N41AP_10.1.1\n" +
        "N41AP_10.2.1\n" +
        "N41AP_10.3.2\n" +
        "N41AP_10.3.3\n" +
        "N42AP_10.3.3\n" +
        "N48AP_10.3.3\n" +
        "N49AP_10.2\n" +
        "N49AP_10.2.1\n" +
        "N49AP_10.3.2\n" +
        "N49AP_10.3.3\n" +
        "N501_5.1\n" +
        "N503_6.0\n" +
        "N51AP_10.0.2\n" +
        "N51AP_10.1.1\n" +
        "N51AP_10.2\n" +
        "N51AP_10.2.1\n" +
        "N51AP_10.3.1\n" +
        "N51AP_10.3.2\n" +
        "N51AP_10.3.3\n" +
        "N51AP_11.0.1\n" +
        "N51AP_11.0.2\n" +
        "N51AP_11.0.3\n" +
        "N51AP_11.1\n" +
        "N51AP_11.1.1\n" +
        "N51AP_11.1.2\n" +
        "N51AP_11.2\n" +
        "N51AP_11.2.1\n" +
        "N51AP_11.2.2\n" +
        "N51AP_11.2.5\n" +
        "N51AP_11.2.6\n" +
        "N53AP_10.0.2\n" +
        "N53AP_10.1.1\n" +
        "N53AP_10.2\n" +
        "N53AP_10.2.1\n" +
        "N53AP_10.3.1\n" +
        "N53AP_10.3.2\n" +
        "N53AP_10.3.3\n" +
        "N53AP_11.0\n" +
        "N53AP_11.0.1\n" +
        "N53AP_11.0.2\n" +
        "N53AP_11.0.3\n" +
        "N53AP_11.1\n" +
        "N53AP_11.1.1\n" +
        "N53AP_11.1.2\n" +
        "N53AP_11.2\n" +
        "N53AP_11.2.1\n" +
        "N53AP_11.2.2\n" +
        "N53AP_11.2.5\n" +
        "N53AP_11.2.6\n" +
        "N53AP_9.3.2\n" +
        "N53AP_9.3.3\n" +
        "N551_6.0\n" +
        "N56AP_10.1.1\n" +
        "N56AP_10.2\n" +
        "N56AP_10.2.1\n" +
        "N56AP_10.3.1\n" +
        "N56AP_10.3.2\n" +
        "N56AP_10.3.3\n" +
        "N56AP_11.0\n" +
        "N56AP_11.0.1\n" +
        "N56AP_11.0.2\n" +
        "N56AP_11.0.3\n" +
        "N56AP_11.1\n" +
        "N56AP_11.1.1\n" +
        "N56AP_11.1.2\n" +
        "N56AP_11.2\n" +
        "N56AP_11.2.1\n" +
        "N56AP_11.2.2\n" +
        "N56AP_11.2.5\n" +
        "N56AP_11.2.6\n" +
        "N61AP_10.0.1\n" +
        "N61AP_10.0.2\n" +
        "N61AP_10.1.1\n" +
        "N61AP_10.2\n" +
        "N61AP_10.2.1\n" +
        "N61AP_10.3.1\n" +
        "N61AP_10.3.2\n" +
        "N61AP_10.3.3\n" +
        "N61AP_11.0\n" +
        "N61AP_11.0.1\n" +
        "N61AP_11.0.2\n" +
        "N61AP_11.0.3\n" +
        "N61AP_11.1\n" +
        "N61AP_11.1.1\n" +
        "N61AP_11.1.2\n" +
        "N61AP_11.2\n" +
        "N61AP_11.2.1\n" +
        "N61AP_11.2.2\n" +
        "N61AP_11.2.5\n" +
        "N61AP_11.2.6\n" +
        "N61AP_11.3\n" +
        "N61AP_9.3.2\n" +
        "N61AP_9.3.5\n" +
        "N66AP_10.2.1\n" +
        "N66AP_10.3.2\n" +
        "N66AP_10.3.3\n" +
        "N66AP_11.0.2\n" +
        "N66AP_11.0.3\n" +
        "N66AP_11.1\n" +
        "N66AP_11.1.1\n" +
        "N66AP_11.1.2\n" +
        "N66AP_11.2\n" +
        "N66AP_11.2.1\n" +
        "N66AP_11.2.2\n" +
        "N66AP_11.2.5\n" +
        "N66AP_11.2.6\n" +
        "N66mAP_10.3.3\n" +
        "N66mAP_11.0.3\n" +
        "N66mAP_11.1.1\n" +
        "N66mAP_11.1.2\n" +
        "N66mAP_11.2\n" +
        "N66mAP_11.2.1\n" +
        "N66mAP_11.2.2\n" +
        "N66mAP_11.2.5\n" +
        "N66mAP_11.2.6\n" +
        "N69AP_10.2.1\n" +
        "N69AP_10.3.2\n" +
        "N69AP_10.3.3\n" +
        "N69AP_11.0.3\n" +
        "N69AP_11.1.1\n" +
        "N69AP_11.1.2\n" +
        "N69AP_11.2\n" +
        "N69AP_11.2.1\n" +
        "N69AP_11.2.2\n" +
        "N69AP_11.2.5\n" +
        "N69AP_11.2.6\n" +
        "N69uAP_10.2.1\n" +
        "N69uAP_10.3.1\n" +
        "N69uAP_10.3.2\n" +
        "N69uAP_10.3.3\n" +
        "N69uAP_11.0.3\n" +
        "N69uAP_11.1.1\n" +
        "N69uAP_11.1.2\n" +
        "N69uAP_11.2\n" +
        "N69uAP_11.2.1\n" +
        "N69uAP_11.2.2\n" +
        "N69uAP_11.2.5\n" +
        "N69uAP_11.2.6\n" +
        "N71AP_10.0.2\n" +
        "N71AP_10.1.1\n" +
        "N71AP_10.2\n" +
        "N71AP_10.2.1\n" +
        "N71AP_10.3.1\n" +
        "N71AP_10.3.2\n" +
        "N71AP_10.3.3\n" +
        "N71AP_11.0\n" +
        "N71AP_11.0.1\n" +
        "N71AP_11.0.2\n" +
        "N71AP_11.0.3\n" +
        "N71AP_11.1\n" +
        "N71AP_11.1.1\n" +
        "N71AP_11.1.2\n" +
        "N71AP_11.2\n" +
        "N71AP_11.2.1\n" +
        "N71AP_11.2.2\n" +
        "N71AP_11.2.5\n" +
        "N71AP_11.2.6\n" +
        "N71AP_11.3\n" +
        "N71mAP_10.1.1\n" +
        "N71mAP_10.2\n" +
        "N71mAP_10.2.1\n" +
        "N71mAP_10.3.1\n" +
        "N71mAP_10.3.2\n" +
        "N71mAP_10.3.3\n" +
        "N71mAP_11.0\n" +
        "N71mAP_11.0.1\n" +
        "N71mAP_11.0.2\n" +
        "N71mAP_11.0.3\n" +
        "N71mAP_11.1\n" +
        "N71mAP_11.1.1\n" +
        "N71mAP_11.1.2\n" +
        "N71mAP_11.2\n" +
        "N71mAP_11.2.1\n" +
        "N71mAP_11.2.2\n" +
        "N71mAP_11.2.5\n" +
        "N71mAP_11.2.6\n" +
        "N71mAP_11.3\n" +
        "N78AP_9.3.5\n" +
        "N90AP_7.1.2\n" +
        "N90bAP_7.1.2\n" +
        "N94AP_9.3.2\n" +
        "N94AP_9.3.5\n" +
        "NeffosC5Max_5.1\n" +
        "NeffosC5_5.1\n" +
        "NeffosY5_6.0.1\n" +
        "Nexus4_5.1.1\n" +
        "Nexus5X_8.0.0\n" +
        "Nexus5X_8.1.0\n" +
        "Nexus5_6.0.1\n" +
        "Nexus6P_8.1.0\n" +
        "Nexus6_7.1.1\n" +
        "NX406E_4.4.4\n" +
        "OCTA_5.1\n" +
        "ONEA2005_6.0.1\n" +
        "ONEPLUSA3000_8.0.0\n" +
        "ONEPLUSA3003_8.0.0\n" +
        "ONEPLUSA3010_8.0.0\n" +
        "ONEPLUSA5000_7.1.1\n" +
        "ONEPLUSA5000_8.0.0\n" +
        "ONEPLUSA5010_7.1.1\n" +
        "ONEPLUSA5010_8.0.0\n" +
        "ONETOUCH4015A_4.2.2\n" +
        "OPPOR11_7.1.1\n" +
        "ORINOQUIAAuyantepui+Y221-U03_4.4.2\n" +
        "P01Z_5.0.2\n" +
        "P101AP_10.3.3\n" +
        "P102AP_10.3.3\n" +
        "P103AP_10.3.3\n" +
        "P105AP_9.3.5\n" +
        "P106AP_9.3.5\n" +
        "PCD508_7.0\n" +
        "PersonalHuaweiG620S_4.4.4\n" +
        "Philips_S326_5.1\n" +
        "Pixel2XL_8.1.0\n" +
        "Pixel2_8.1.0\n" +
        "PixelXL_8.1.0\n" +
        "Pixel_8.1.0\n" +
        "PlusE_6.0.1\n" +
        "PositivoNext_5.1\n" +
        "PositivoTwist4G_6.0\n" +
        "PositivoTwistM_6.0\n" +
        "PositivoTwistS_6.0\n" +
        "PRA-LX1_7.0\n" +
        "PRA-LX3_7.0\n" +
        "PSPC550_5.1\n" +
        "PUREXL_5.1\n" +
        "PureXR_6.0\n" +
        "Q5_6.0\n" +
        "QuantumFly_6.0\n" +
        "QuantumGo_5.1\n" +
        "QuantumGo_6.0\n" +
        "QuantumMUVPRO_6.0\n" +
        "QuantumMUVUP_7.0\n" +
        "R1HD_6.0\n" +
        "R1PLUS_6.0\n" +
        "RAZRHD_4.4.2\n" +
        "Redmi3S_6.0.1\n" +
        "Redmi3_5.1.1\n" +
        "Redmi4A_6.0.1\n" +
        "Redmi4A_7.1.2\n" +
        "Redmi4X_6.0.1\n" +
        "Redmi4X_7.1.2\n" +
        "Redmi4_6.0.1\n" +
        "RedmiNote3_5.0.2\n" +
        "RedmiNote3_5.1.1\n" +
        "RedmiNote3_6.0.1\n" +
        "RedmiNote4X_6.0\n" +
        "RedmiNote4_6.0\n" +
        "RedmiNote4_6.0.1\n" +
        "RedmiNote4_7.0\n" +
        "RedmiNote5APrime_7.1.2\n" +
        "RedmiNote5A_7.1.2\n" +
        "RedmiPro_6.0\n" +
        "RNE-L03_7.0\n" +
        "Rolling_6.0.1\n" +
        "RS988_7.0\n" +
        "S30_5.1\n" +
        "S40_5.1\n" +
        "S420_5.1\n" +
        "S421PositivoLife_6.0\n" +
        "S430PositivoTwistMini_6.0\n" +
        "S455_5.0.2\n" +
        "S480_5.0.2\n" +
        "S550_4.4.2\n" +
        "S60_6.0.1\n" +
        "S7_5.1\n" +
        "S7_7.1.1\n" +
        "S8_5.1\n" +
        "S8_7.1.1\n" +
        "SAMSUNG-SGH-I337_4.4.2\n" +
        "SAMSUNG-SM-G900A_4.4.2\n" +
        "SAMSUNG-SM-G900A_5.0\n" +
        "SAMSUNG-SM-G900A_5.1.1\n" +
        "SAMSUNG-SM-G920A_6.0.1\n" +
        "SAMSUNG-SM-G925A_5.1.1\n" +
        "SAMSUNG-SM-G925A_6.0.1\n" +
        "SAMSUNG-SM-G928A_6.0.1\n" +
        "SAMSUNG-SM-G930A_6.0.1\n" +
        "SAMSUNG-SM-G935A_6.0.1\n" +
        "SAMSUNG-SM-G935A_7.0\n" +
        "SAMSUNG-SM-J120A_6.0.1\n" +
        "SAMSUNG-SM-J320A_6.0.1\n" +
        "SAMSUNG-SM-J320A_7.1.1\n" +
        "SAMSUNG-SM-N900A_4.4.2\n" +
        "SAMSUNG-SM-N900A_5.0\n" +
        "SAMSUNG-SM-N920A_6.0.1\n" +
        "SCH-I545_5.0.1\n" +
        "SGH-I337M_5.0.1\n" +
        "SGH-M919_4.4.4\n" +
        "SK504_4.1.2\n" +
        "SKY4.0D_4.4.2\n" +
        "Sky_7.0\n" +
        "SLA-L03_7.0\n" +
        "SM-A300H_5.0.2\n" +
        "SM-A300M_4.4.4\n" +
        "SM-A300M_5.0.2\n" +
        "SM-A300YZ_5.0.2\n" +
        "SM-A310F_7.0\n" +
        "SM-A310M_5.1.1\n" +
        "SM-A310M_6.0.1\n" +
        "SM-A310M_7.0\n" +
        "SM-A320Y_7.0\n" +
        "SM-A500H_6.0.1\n" +
        "SM-A500M_4.4.4\n" +
        "SM-A500M_5.0.2\n" +
        "SM-A500M_6.0.1\n" +
        "SM-A510F_7.0\n" +
        "SM-A510M_5.1.1\n" +
        "SM-A510M_6.0.1\n" +
        "SM-A510M_7.0\n" +
        "SM-A520F_6.0.1\n" +
        "SM-A520F_7.0\n" +
        "SM-A530F_7.1.1\n" +
        "SM-A700FD_5.0.2\n" +
        "SM-A700FD_6.0.1\n" +
        "SM-A710M_5.1.1\n" +
        "SM-A710M_6.0.1\n" +
        "SM-A710M_7.0\n" +
        "SM-A720F_6.0.1\n" +
        "SM-A720F_7.0\n" +
        "SM-A730F_7.1.1\n" +
        "SM-A9000_6.0.1\n" +
        "SM-A910F_6.0.1\n" +
        "SM-A910F_7.0\n" +
        "SM-C101_4.4.2\n" +
        "SM-C115M_4.4.2\n" +
        "SM-C5000_6.0.1\n" +
        "SM-C5000_7.0\n" +
        "SM-C7000_6.0.1\n" +
        "SM-C7000_7.0\n" +
        "SM-C9000_6.0.1\n" +
        "SM-C9000_7.1.1\n" +
        "SM-E500M_4.4.4\n" +
        "SM-E500M_5.1.1\n" +
        "SM-E700M_4.4.4\n" +
        "SM-E700M_5.1.1\n" +
        "SM-G110B_4.4.2\n" +
        "SM-G130BT_4.4.4\n" +
        "SM-G130BU_4.4.4\n" +
        "SM-G130M_4.4.2\n" +
        "SM-G313ML_4.4.2\n" +
        "SM-G313MU_4.4.2\n" +
        "SM-G313M_4.4.2\n" +
        "SM-G316ML_4.4.4\n" +
        "SM-G316M_4.4.4\n" +
        "SM-G318ML_4.4.4\n" +
        "SM-G3502L_4.3\n" +
        "SM-G3502T_4.3\n" +
        "SM-G350L_4.3\n" +
        "SM-G355H_4.4.2\n" +
        "SM-G355M_4.4.2\n" +
        "SM-G357M_4.4.2\n" +
        "SM-G360BT_4.4.4\n" +
        "SM-G360BT_5.0.2\n" +
        "SM-G360M_4.4.4\n" +
        "SM-G360M_5.0.2\n" +
        "SM-G360T1_5.1.1\n" +
        "SM-G3812B_4.2.2\n" +
        "SM-G530BT_4.4.4\n" +
        "SM-G530BT_5.0.2\n" +
        "SM-G530H_4.4.4\n" +
        "SM-G530H_5.0.2\n" +
        "SM-G530MU_4.4.4\n" +
        "SM-G530M_4.4.4\n" +
        "SM-G530M_5.0.2\n" +
        "SM-G531BT_5.1.1\n" +
        "SM-G531F_5.1.1\n" +
        "SM-G531H_5.1.1\n" +
        "SM-G531M_5.1.1\n" +
        "SM-G532F_6.0.1\n" +
        "SM-G532G_6.0.1\n" +
        "SM-G532MT_6.0.1\n" +
        "SM-G532M_6.0.1\n" +
        "SM-G550T1_6.0.1\n" +
        "SM-G570F_6.0.1\n" +
        "SM-G570F_7.0\n" +
        "SM-G570M_6.0.1\n" +
        "SM-G570M_7.0\n" +
        "SM-G600FY_5.1.1\n" +
        "SM-G600FY_6.0.1\n" +
        "SM-G610F_6.0.1\n" +
        "SM-G610F_7.0\n" +
        "SM-G610M_6.0.1\n" +
        "SM-G610M_7.0\n" +
        "SM-G615F_7.0\n" +
        "SM-G7102T_4.3\n" +
        "SM-G7102_4.4.2\n" +
        "SM-G710_4.3\n" +
        "SM-G800F_6.0.1\n" +
        "SM-G800H_4.4.2\n" +
        "SM-G800H_5.1.1\n" +
        "SM-G800H_6.0.1\n" +
        "SM-G800M_4.4.2\n" +
        "SM-G800M_6.0.1\n" +
        "SM-G850M_5.0.2\n" +
        "SM-G900FD_6.0.1\n" +
        "SM-G900F_6.0.1\n" +
        "SM-G900H_4.4.2\n" +
        "SM-G900H_5.0\n" +
        "SM-G900H_6.0.1\n" +
        "SM-G900MD_5.0\n" +
        "SM-G900MD_6.0.1\n" +
        "SM-G900M_4.4.2\n" +
        "SM-G900M_5.0\n" +
        "SM-G900M_6.0.1\n" +
        "SM-G900M_7.1.2\n" +
        "SM-G900P_6.0.1\n" +
        "SM-G900T_6.0.1\n" +
        "SM-G900V_5.0\n" +
        "SM-G900V_6.0.1\n" +
        "SM-G903F_6.0.1\n" +
        "SM-G903M_5.1.1\n" +
        "SM-G903M_6.0.1\n" +
        "SM-G920F_6.0.1\n" +
        "SM-G920F_7.0\n" +
        "SM-G920I_5.1.1\n" +
        "SM-G920I_6.0.1\n" +
        "SM-G920I_7.0\n" +
        "SM-G920P_7.0\n" +
        "SM-G920T_7.0\n" +
        "SM-G920V_6.0.1\n" +
        "SM-G920V_7.0\n" +
        "SM-G925F_4.4.2\n" +
        "SM-G925F_7.0\n" +
        "SM-G925I_5.1.1\n" +
        "SM-G925I_6.0.1\n" +
        "SM-G925I_7.0\n" +
        "SM-G925P_7.0\n" +
        "SM-G925T_7.0\n" +
        "SM-G925V_6.0.1\n" +
        "SM-G925V_7.0\n" +
        "SM-G928C_7.0\n" +
        "SM-G928F_7.0\n" +
        "SM-G928G_5.1.1\n" +
        "SM-G928G_6.0.1\n" +
        "SM-G928G_7.0\n" +
        "SM-G928T_7.0\n" +
        "SM-G928V_6.0.1\n" +
        "SM-G928V_7.0\n" +
        "SM-G930F_6.0.1\n" +
        "SM-G930F_7.0\n" +
        "SM-G930K_4.4.2\n" +
        "SM-G930P_7.0\n" +
        "SM-G930T_7.0\n" +
        "SM-G930U_7.0\n" +
        "SM-G930V_6.0.1\n" +
        "SM-G930V_7.0\n" +
        "SM-G9350_4.4.2\n" +
        "SM-G9350_7.0\n" +
        "SM-G935F_6.0.1\n" +
        "SM-G935F_7.0\n" +
        "SM-G935P_7.0\n" +
        "SM-G935T_7.0\n" +
        "SM-G935U_7.0\n" +
        "SM-G935V_6.0.1\n" +
        "SM-G935V_7.0\n" +
        "SM-G950F_7.0\n" +
        "SM-G950F_8.0.0\n" +
        "SM-G950U1_7.0\n" +
        "SM-G950U_7.0\n" +
        "SM-G9550_7.0\n" +
        "SM-G955F_4.4.2\n" +
        "SM-G955F_7.0\n" +
        "SM-G955F_8.0.0\n" +
        "SM-G955U1_7.0\n" +
        "SM-G955U_7.0\n" +
        "SM-J100MU_4.4.4\n" +
        "SM-J100M_4.4.4\n" +
        "SM-J105B_5.1.1\n" +
        "SM-J105H_5.1.1\n" +
        "SM-J105M_5.1.1\n" +
        "SM-J106B_6.0.1\n" +
        "SM-J106H_6.0.1\n" +
        "SM-J106M_6.0.1\n" +
        "SM-J110H_4.4.4\n" +
        "SM-J110L_4.4.4\n" +
        "SM-J110M_5.1.1\n" +
        "SM-J111M_5.1.1\n" +
        "SM-J120H_5.1.1\n" +
        "SM-J120M_5.1.1\n" +
        "SM-J200BT_5.1.1\n" +
        "SM-J200H_5.1.1\n" +
        "SM-J200M_5.1.1\n" +
        "SM-J3110_5.1.1\n" +
        "SM-J320H_5.1.1\n" +
        "SM-J320M_5.1.1\n" +
        "SM-J327P_6.0.1\n" +
        "SM-J327T1_7.0\n" +
        "SM-J500FN_5.1.1\n" +
        "SM-J500FN_6.0.1\n" +
        "SM-J500H_5.1.1\n" +
        "SM-J500H_6.0.1\n" +
        "SM-J500M_5.1.1\n" +
        "SM-J500M_6.0.1\n" +
        "SM-J510FN_6.0.1\n" +
        "SM-J510FN_7.1.1\n" +
        "SM-J510MN_6.0.1\n" +
        "SM-J510MN_7.1.1\n" +
        "SM-J530F_7.0\n" +
        "SM-J530GM_7.0\n" +
        "SM-J530G_7.0\n" +
        "SM-J700F_5.1.1\n" +
        "SM-J700F_6.0.1\n" +
        "SM-J700H_6.0.1\n" +
        "SM-J700M_5.1.1\n" +
        "SM-J700M_6.0.1\n" +
        "SM-J700T1_7.1.1\n" +
        "SM-J701MT_7.0\n" +
        "SM-J701M_7.0\n" +
        "SM-J710F_7.0\n" +
        "SM-J710MN_6.0.1\n" +
        "SM-J710MN_7.0\n" +
        "SM-J730F_7.0\n" +
        "SM-J730GM_7.0\n" +
        "SM-J730G_7.0\n" +
        "SM-N7502_4.3\n" +
        "SM-N9005_4.4.2\n" +
        "SM-N9005_5.0\n" +
        "SM-N900T_5.0\n" +
        "SM-N900V_5.0\n" +
        "SM-N900W8_5.0\n" +
        "SM-N900_5.0\n" +
        "SM-N910C_6.0.1\n" +
        "SM-N910H_6.0.1\n" +
        "SM-N910T_6.0.1\n" +
        "SM-N910U_6.0.1\n" +
        "SM-N910V_6.0.1\n" +
        "SM-N915T_6.0.1\n" +
        "SM-N920C_7.0\n" +
        "SM-N920G_6.0.1\n" +
        "SM-N920G_7.0\n" +
        "SM-N920I_7.0\n" +
        "SM-N920P_7.0\n" +
        "SM-N920T_7.0\n" +
        "SM-N920V_6.0.1\n" +
        "SM-N920V_7.0\n" +
        "SM-N930F_6.0.1\n" +
        "SM-N935F_4.4.2\n" +
        "SM-N9500_7.1.1\n" +
        "SM-N950F_7.1.1\n" +
        "SM-N950U1_7.1.1\n" +
        "SM-N950U_7.1.1\n" +
        "SM-P350_6.0.1\n" +
        "SM-P355M_7.1.1\n" +
        "SM-P550_7.1.1\n" +
        "SM-P555M_7.1.1\n" +
        "SM-P580_7.0\n" +
        "SM-P585M_7.0\n" +
        "SM-P601_5.1.1\n" +
        "SM-T110_4.2.2\n" +
        "SM-T111M_4.2.2\n" +
        "SM-T113NU_4.4.4\n" +
        "SM-T113_4.4.4\n" +
        "SM-T116BU_4.4.4\n" +
        "SM-T210R_4.4.2\n" +
        "SM-T210_4.4.2\n" +
        "SM-T211M_4.4.2\n" +
        "SM-T211_4.4.2\n" +
        "SM-T230NT_4.4.2\n" +
        "SM-T230NU_4.4.2\n" +
        "SM-T230_4.4.2\n" +
        "SM-T231_4.4.2\n" +
        "SM-T280_5.1.1\n" +
        "SM-T285M_5.1.1\n" +
        "SM-T310_4.4.2\n" +
        "SM-T311_4.4.2\n" +
        "SM-T320_4.4.2\n" +
        "SM-T330_5.1.1\n" +
        "SM-T350_7.1.1\n" +
        "SM-T530NU_5.0.2\n" +
        "SM-T530_5.0.2\n" +
        "SM-T531_4.4.2\n" +
        "SM-T560_4.4.4\n" +
        "SM-T561M_4.4.4\n" +
        "SM-T580_7.0\n" +
        "SM-T700_6.0.1\n" +
        "SM-T705M_6.0.1\n" +
        "SM-T710_7.0\n" +
        "SM-T713_7.0\n" +
        "SM-T715Y_7.0\n" +
        "SM-T800_6.0.1\n" +
        "SM-T805M_6.0.1\n" +
        "SM-T810_7.0\n" +
        "SM-T813_7.0\n" +
        "SM-T815Y_7.0\n" +
        "SM-T825_7.0\n" +
        "STF-L09_7.0\n" +
        "STUDIO5.0K_4.4.2\n" +
        "StudioCHD_6.0\n" +
        "STUDIOENERGY2_5.0\n" +
        "StudioG2HD_6.0\n" +
        "StudioGHDLTE_6.0\n" +
        "STUDIOMHD_5.1\n" +
        "StudioXL2_6.0\n" +
        "STUDIO_G_HD_5.1\n" +
        "STV100-1_6.0.1\n" +
        "STV100-2_6.0.1\n" +
        "SUPER_7.0\n" +
        "T-i708G_5.1.1\n" +
        "T-i716_5.1.1\n" +
        "T1060B_4.4.2\n" +
        "T17.0_4.4.2\n" +
        "T5_7.0\n" +
        "T7A6_6.0\n" +
        "TA-1025_7.1.1\n" +
        "TA-1025_7.1.2\n" +
        "TA-1027_7.1.2\n" +
        "TA-1028_7.1.1\n" +
        "TA-1038_7.1.1\n" +
        "TA-1039_7.1.2\n" +
        "TA0708G_4.4.2\n" +
        "Tablet_DL_3420_5.1.1\n" +
        "thor_7.0\n" +
        "TRT-L53_7.0\n" +
        "TRT-LX3_7.0\n" +
        "TwistMax_7.0\n" +
        "TwistMini_6.0\n" +
        "TwistXL_7.0\n" +
        "UltraEnergyPlus_5.0\n" +
        "UltraLatitude_5.0\n" +
        "UltraLink_6.0\n" +
        "UltraLiveII_6.0\n" +
        "UltraShadow_6.0\n" +
        "UltraStorm_6.0\n" +
        "UltraStorm_7.0\n" +
        "UltraStyle_5.0\n" +
        "VibeK5Plus_7.1.2\n" +
        "VIE-L29_6.0\n" +
        "ViewphoneQ5_5.1.1\n" +
        "Vivo5Mini_6.0\n" +
        "Vivo5R_6.0\n" +
        "Vivo5R_7.0\n" +
        "VIVO5_5.1\n" +
        "VIVO5_6.0\n" +
        "Vivo6_6.0\n" +
        "Vivo8_7.0\n" +
        "VIVOIV_4.4.2\n" +
        "VivoXL2_6.0\n" +
        "VivoXL2_7.0\n" +
        "VIVOXL_5.1\n" +
        "VIVOXL_6.0\n" +
        "VKY-L09_7.0\n" +
        "VKY-L29_7.0\n" +
        "VTR-L09_7.0\n" +
        "VTR-L29_7.0\n" +
        "W509_4.4.4\n" +
        "WAS-LX1A_7.0\n" +
        "WAS-LX3_7.0\n" +
        "X5max_PRO_6.0\n" +
        "XT1021_4.4.4\n" +
        "XT1021_5.1\n" +
        "XT1022_4.4.4\n" +
        "XT1022_5.1\n" +
        "XT1025_4.4.4\n" +
        "XT1025_5.1\n" +
        "XT1032_4.4.2\n" +
        "XT1032_4.4.4\n" +
        "XT1032_5.1\n" +
        "XT1033_4.3\n" +
        "XT1033_4.4.2\n" +
        "XT1033_4.4.3\n" +
        "XT1033_4.4.4\n" +
        "XT1033_5.0.2\n" +
        "XT1033_5.1\n" +
        "XT1034_4.4.2\n" +
        "XT1034_4.4.3\n" +
        "XT1034_5.1\n" +
        "XT1039_5.1\n" +
        "XT1040_4.4.4\n" +
        "XT1040_5.1\n" +
        "XT1053_5.1\n" +
        "XT1058_4.4.4\n" +
        "XT1058_5.1\n" +
        "XT1063_6.0\n" +
        "XT1064_6.0\n" +
        "XT1068_4.4.4\n" +
        "XT1068_5.0.2\n" +
        "XT1068_6.0\n" +
        "XT1069_4.4.4\n" +
        "XT1069_5.0.2\n" +
        "XT1069_6.0\n" +
        "XT1072_6.0\n" +
        "XT1078_5.0.2\n" +
        "XT1078_6.0\n" +
        "XT1092_6.0\n" +
        "XT1095_7.1.2\n" +
        "XT1097_5.1\n" +
        "XT1097_6.0\n" +
        "XT1225_6.0.1\n" +
        "XT1254_6.0.1\n" +
        "XT1562_6.0.1\n" +
        "XT1562_7.1.1\n" +
        "XT1563_5.1.1\n" +
        "XT1563_6.0.1\n" +
        "XT1563_7.1.2\n" +
        "XT1572_6.0\n" +
        "XT1572_7.0\n" +
        "XT1575_7.0\n" +
        "XT1580_7.0\n" +
        "XT1585_7.0\n" +
        "XT1635-01_7.1.1\n" +
        "XT1635-02_6.0.1\n" +
        "XT1635-02_7.0\n" +
        "XT1635-02_7.1.1\n" +
        "XT1650_7.0\n" +
        "XT1650_7.1.1\n" +
        "XT1663_7.0\n" +
        "XT1700_6.0\n" +
        "XT890_4.1.2\n" +
        "XT890_4.4.2\n" +
        "XT918_4.4.2\n" +
        "XT920_4.4.2\n" +
        "Y340-U081_4.1.2\n" +
        "Y550-L03_4.4.4\n" +
        "Y635-L03_4.4.4\n" +
        "YouL_7.0\n" +
        "You_7.0\n" +
        "Z2131_6.0.1\n" +
        "Z2Plus_7.1.2\n" +
        "Z2Plus_8.1.0\n" +
        "Z812_5.1\n" +
        "Z981_6.0.1\n" +
        "ZB500KG_5.1.1\n" +
        "ZE553KL_6.0.1\n" +
        "ZE553KL_7.1.1\n" +
        "ZPlay_6.0\n" +
        "ZTEA2017U_7.1.1\n" +
        "ZTEB2017G_7.1.1\n" +
        "ZTEBLADEA110_5.1\n" +
        "ZTEBLADEA310_6.0.1\n" +
        "ZTEBladeA410_5.1\n" +
        "ZTEBladeApex2_4.4.2\n" +
        "ZTEBLADEL110_5.1\n" +
        "ZTEBladeL5_5.1\n" +
        "ZTEBladeV6Plus_6.0\n" +
        "ZTEE10Q_4.4.2\n" +
        "ZUKZ2121_6.0.1\n" +
        "ZUKZ2131_6.0.1\n" +
        "ZUKZ2132_7.0\n" +
        "MOTOE(4)PLUS_7.1.1\n" +
        "N69UAP_11.2.6\n" +
        "SM-J500M_6.0.1");
  }

}