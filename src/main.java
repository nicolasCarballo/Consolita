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

//    JSONObject jsonObj1 = new JSONObject("{\"payment\":{\"id\":111111}}");
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
    obtenerDay(1538575200337l);
//    Map<String, Object> mapForFilterDates = new HashMap<>();
//    mapForFilterDates.put("2018-05-04",0);
//    mapForFilterDates.put("2018-05-04",0);
//    mapForFilterDates.put("2018-04-22",1);
//    mapForFilterDates.put("2018-03-22",0);
//    mapForFilterDates.put("2018-02-22",1);
//    mapForFilterDates.put("2018-01-22",0);
//    mapForFilterDates.put("2017-12-22",1);
//    mapForFilterDates.put("2017-11-22",0);
//    mapForFilterDates.put("2017-10-22",1);
//    mapForFilterDates.put("2017-09-22",0);
//    mapForFilterDates.put("2017-08-22",1);
//    mapForFilterDates.put("2017-07-22",0);
//    mapForFilterDates.put("2017-06-22",1);
//    mapForFilterDates.put("2017-05-22",0);
//    mapForFilterDates.put("2017-04-22",1);
//    filterDates(mapForFilterDates,trabajarConFechas());

    //trabajarConFechas();

    //jodaExample();

    //JSONObject orderResp = recorrerJsonRespuesta();

    //buscarString();

    subString();

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
    String dondeBuscar="";
    String[] queBuscar  = {"phtc_amt_25_app_acc_1d","phtc_amt_25_app_acc_3d"};
    for (String palabra : queBuscar) {
      cantidad++;
      if (dondeBuscar.contains(palabra)) {
        exito++;
      }
    }
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


}