package com.example.a2drecycerviewassign;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<ParentProduct> parentProducts;
    List <ChildProduct> childProduct1s1;
    List <ChildProduct> childProduct1s2;
    List <ChildProduct> childProduct1s3;
    List <ChildProduct> childProduct1s4;
    List <ChildProduct> childProduct1s5;
    List <ChildProduct> childProduct1s6;
    List <ChildProduct> childProduct1s7;
    List <ChildProduct> childProduct1s8;
    List <ChildProduct> childProduct1s9;
    List <ChildProduct> childProducts1;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.parent_rv);
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomBar);
        bottomNavigationView.setSelectedItemId(R.id.apps);
        childProduct1s1=generateChildData1();
        childProduct1s2=generateChildData2();
        childProduct1s3=generateChildData3();
        childProduct1s4=generateChildData4();
        childProduct1s5=generateChildData5();
        childProduct1s6=generateChildData6();
        childProduct1s7=generateChildData7();
        childProduct1s8=generateChildData8();
        childProduct1s9=generateChildData9();
        childProducts1=generateChildData10();
        parentProducts=generateParentData();
        ParentAdapter parentAdapter=new ParentAdapter(parentProducts);
        recyclerView.setAdapter(parentAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);


    }
    public List <ChildProduct> generateChildData10() {
        List <ChildProduct> childProducts=new ArrayList<>();
        childProducts.add(new ChildProduct2(R.drawable.daraz,"Daraz Online Shopping App","Shopping","Online marketplace",4.6f,"38 MB",R.drawable.yango_logo,"Ynago: affordable taxi rides","Travel & Local","Rideshare & taxis",4.8f,"39 MB",R.drawable.instagram,"Instagram","Social","Networking",4.4f,"74 MB"));
        childProducts.add(new ChildProduct2(R.drawable.yalla_ludo,"Yalla Ludo - Ludo&Domino","Board","Dice",4.4f,"239 MB",R.drawable.indrive_logo,"inDrive - Taxi & Driver App","Business","Maps & Navigation",4.7f,"67 MB",R.drawable.paisayaar,"Paisayaar-Easy Safe Cash Loan","Finance","loan",4.5f,"12 MB"));
        childProducts.add(new ChildProduct2(R.drawable.xm360,"XM 360 - Trading App","Finance","Trading",4.4f,"40 MB",R.drawable.zindgi,"Zindigi - All in One Finance","Finance","Earn",3.9f,"89 MB",R.drawable.smarta_qarza,"SmartQarza-Safe easy cash loan","Loan","Finance",4.4f,"13 MB"));
        childProducts.add(new ChildProduct2(R.drawable.pocket_broker,"Pocket Broker - trading","Finance","Trading",3.8f,"4.5 MB",R.drawable.shein,"SHEIN-Shopping Online","Shopping","Retailer",4.1f,"34 MB",R.drawable.krave_mart,"Krave Mart - Grocery Delivery","Food & Drink","Grocery lists",4.4f,"27 MB"));
        childProducts.add(new ChildProduct2(R.drawable.yango_play,"Yango Play","Entertainment","Streaming content",4.3f,"120 MB",R.drawable.oyetalk,"OyeTalk - Live Voice Chat Room","Social","Networking & Entertainment",4.0f,"60 MB",R.drawable.avianca,"Avianca - Mobile Phone Boarding","Cell Phone","Boarding Pass",4.7f,"26 MB"));
        return childProducts;
    }


    public List <ChildProduct> generateChildData1(){
        List <ChildProduct> childProduct1s1=new ArrayList<>();
        childProduct1s1.add(new ChildProduct1(R.drawable.hblapplogo,"HBL Mobile",4.8f));
        childProduct1s1.add(new ChildProduct1(R.drawable.bidget_wallet,"Bidget Wallet: Crypto and BTC",4.6f));
        childProduct1s1.add(new ChildProduct1(R.drawable.bitget_token_logo,"Bidget - Buy & Sell Crypto",4.5f));
        childProduct1s1.add(new ChildProduct1(R.drawable.bybit_logo,"Bybit: Buy Bitcoin & Crypto",4.5f));
        childProduct1s1.add(new ChildProduct1(R.drawable.kucoin_logo,"KuCoin: Buy Bitcoin & Crypto",4.4f));
        childProduct1s1.add(new ChildProduct1(R.drawable.bingx_logo,"BingX Trade BTC,Buy Crypto",4.6f));
        childProduct1s1.add(new ChildProduct1(R.drawable.mwtamask_logo,"MetaMask - Blockchain",4.5f));
        childProduct1s1.add(new ChildProduct1(R.drawable.jazzcash_logo,"JazzCash Business",4.6f));
        childProduct1s1.add(new ChildProduct1(R.drawable.zindigi_logo,"Zindigi - All in One Finance",3.8f));
        childProduct1s1.add(new ChildProduct1(R.drawable.cex_logo,"CEX.IO App - Buy Crypto",4.3f));
        childProduct1s1.add(new ChildProduct1(R.drawable.smart_wallet_logo,"Smart Wallet",4.3f));
        childProduct1s1.add(new ChildProduct1(R.drawable.simpl_logo,"Simple: Buy Crypto BTC",4.8f));
        childProduct1s1.add(new ChildProduct1(R.drawable.cointelegraph_logo,"Cointelegraph: Crypto News",4.4f));
        childProduct1s1.add(new ChildProduct1(R.drawable.airtm_logo,"Airtm",4.7f));
        childProduct1s1.add(new ChildProduct1(R.drawable.anycrypto_logo,"AnCrypto: Safest Web3",4.4f));
        return childProduct1s1;
    }
    public List <ChildProduct> generateChildData2(){
        List<ChildProduct> childProduct1s=new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.indrive_logo,"inDrive -- Taxi & Driver App",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.yango_logo,"Yango: affordable taxi rides",4.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_scanner_logo,"PDF Scanner app - TapScanner",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.cspdf_logo,"CS PDF Reader - PDF Editor",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.pi_logo2,"Pi Network",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.copilot_logo,"Microsoft Copilot",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.imbd,"IMDb: Movies & TV Shows",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.document_reader,"Document Reader - PDF Editor",4.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.gauth,"Gauth: AI Study Companion",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.solo_learn,"Sololearn: Learn to code",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.programming_hub,"Programming Hub: Learn to co...",4.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_reader,"PDF Reader - PDF Editor",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.kiwi_brower,"Kiwi Browser - Fast & Quiet",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.sas,"Sastaticket.pk Fligths, Bus",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.vpn_proton,"VPN Proton: Fast & Secure VPN",4.6f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData3(){
        List <ChildProduct> childProduct1s=new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.expense_manager,"Expense Manager",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.wps_office,"WPS Office-PDF,Word...",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.chaton,"ChatOn - AI Chat Bot Assistant",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.claude_by_anthropic,"Claude by Anthropic",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_scanner,"PDF Scanner APP - Scan to PDF",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.adobe_acrobat,"Adobe Acrobat Reader: Edit PDF",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.microsoft_teams,"Microsoft Teams",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.chatbot_ai,"Chatbot AI Chat Open Assistant",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.perplexity,"Perplexity - Ask Anything",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.wps_office_lite,"WPS Office Lite",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.clickup,"ClickUp - Manage Teams & Tasks",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.chat_ai,"Chat AI: AI Chat Bot Assistant",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.ottherai,"OtterAi Transcribe Voice Notes",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.assistant_for_android,"Assistant for Android",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.anydo,"Any.do - To do list & Calendar",4.3f));
        return childProduct1s;
    }
    public List <ChildProduct> generateChildData4(){
        List <ChildProduct> childProduct1s=new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_file_reader,"PDF File Editor & Reader: Xodo",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.fillandsing,"Fill and Sign Easy PDF Editor",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.anycopy,"AnyCopy-Copy & Paste Clipboard",3.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_viewer_lite,"PDF viewer lite",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.mergepdf,"PDF Merge: Combine PDF",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.collabora,"Collabora Office",3.9f));
        childProduct1s.add(new ChildProduct1(R.drawable.presentation_creater,"Presentation Creator",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.docx,"All Document Reader : Docx P...",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.pdf_esign,"PDFEsign.com PDF E-Sign",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.foxit,"Foxit PDF Editor",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.llovepdf,"ILovePDF: PDF Editor & Scanner",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.polaris,"Polaris  Office: Edit&View, PDF",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.microsoft_lists,"Microsoft Lists",3.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.text_extracter,"Text Extractor:image...",3.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.readwise_reader,"Readwise Reader",4.1f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData5(){
        List<ChildProduct> childProduct1s=new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.browsec,"Browsec: Fast Secure VPN Proxy",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.vpn_potato,"VPN PotatoVPN - WiFi Proxy",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.vid_iq,"vidIQ for YouTube",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.terabox,"TeraBox: Cloud Storage Space",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.uc_browser,"UC Browser-Safe,Fast,Private",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.zarchiver,"ZArchiver",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.microsoft_bing,"Microsoft Bing Search",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.anydesk,"AnyDesk Remote Desktop",4.f));
        childProduct1s.add(new ChildProduct1(R.drawable.advscreen,"ADV Screen Recorder",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.disc_digger,"DiskDigger Pro file recovery",3.1f));
        childProduct1s.add(new ChildProduct1(R.drawable.duo_mobile,"Duo Mobile",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.meta_ads,"Meta Ads Manager",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.lithuim,"Lithium: EPUB Reader",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.glasswire,"GlassWire Data Usage Monitor",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.every_proxy,"Every Proxy Network Bridge",3.2f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData6(){
        List<ChildProduct> childProduct1s=new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.tonestro,"tonestro - Music Lessons",3.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.reverso,"Reverso Translate and Learn",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.water_tracker,"Water Tracker: WaterMinder app",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.fitness_rpg,"Fitness: Walking Games",3.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.woman_log_period,"WomanLog Period Calendar",4.0f));
        childProduct1s.add(new ChildProduct1(R.drawable.bettersleep,"BetterSleep: Sleep tracker",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.uptime,"Uptime: Get smarter,stand out",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.beeling,"Beelinguapp Language Audio...",3.9f));
        childProduct1s.add(new ChildProduct1(R.drawable.bumble_dating,"Bumble Dating App: Meet & Date",4.4f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData7() {
        List<ChildProduct> childProduct1s = new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.cheelee,"Cheelee: watch and get money",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.pinterest,"Pinterest",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.telegram_x,"Telegram X",4.1f));
        childProduct1s.add(new ChildProduct1(R.drawable.instagram_lite,"Instagram Lite",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.threads,"Threads",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.nicegram,"Nicegram: Chat for Telegram X",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.nice_os_14,"Nice OS14 Camera- i OS14",4.1f));
        childProduct1s.add(new ChildProduct1(R.drawable.weverse,"Weverse:Connect with Artists",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.relens,"Relens Camera-Focus...",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.baaz,"Baaz",3.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.camero,"Camero - Personal celeb",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.battle,"Battle.net",3.7f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData8() {
        List<ChildProduct> childProduct1s = new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.datacamp,"DataCamp | AI and coding",4.9f));
        childProduct1s.add(new ChildProduct1(R.drawable.simplilearn,"Simplilearn: Online Learning",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_blockchain,"Learn Blockchain Programming",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_ai_ml,"Learn AI & ML with Python",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_java,"Learn Java",4.8f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_coding,"Learn Coding /Programming: M...",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.solar_system,"Solar System Scope",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.reactionflash,"ReactionFlash",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_python,"Learn Python,Java",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_biology,"Learn Biology All Division",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.physics_lab,"Physics Lab",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.code_snack,"CodeSnack IDE",4.4f));
        childProduct1s.add(new ChildProduct1(R.drawable.upstudy,"UpStudy - Math Solver",4.2f));
        return childProduct1s;
    }
    public List<ChildProduct> generateChildData9() {
        List<ChildProduct> childProduct1s = new ArrayList<>();
        childProduct1s.add(new ChildProduct1(R.drawable.babycode,"BabyCode IELTS/PTE",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.wordup,"WordUp | Al Vocabulary Build...",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.vocabulary_builder,"Vocabulary Builder - Test Pr...",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.roseta_stone,"Rosetta Stone: Learn,Practice",4.6f));
        childProduct1s.add(new ChildProduct1(R.drawable.speaky_language,"Speaky - Language Excha...",3.0f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_korean,"Learn Korean Offline For Go",4.2f));
        childProduct1s.add(new ChildProduct1(R.drawable.langeek,"LanGeek | English Vocabulary",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_english,"Hello English: Learn English",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.conjugato,"ConjuGato - Spanish Verbs",4.1f));
        childProduct1s.add(new ChildProduct1(R.drawable.promova,"Promova Easy Language Learni...",4.3f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_chinese,"Learn Chinese - Speak Chinese",4.7f));
        childProduct1s.add(new ChildProduct1(R.drawable.busuu,"Bussuu: Learn & Speak Languages",4.5f));
        childProduct1s.add(new ChildProduct1(R.drawable.camply,"Cambly - Learn English",3.9f));
        childProduct1s.add(new ChildProduct1(R.drawable.learn_german,"DW Learn German",4.1f));
        return childProduct1s;
    }

    public List<ParentProduct> generateParentData(){
        List<ParentProduct> parentProductList=new ArrayList<>();
        parentProductList.add(new ParentProduct("Budgeting tools",R.drawable.baseline_arrow_forward_24,childProduct1s1));
        parentProductList.add(new ParentProduct("Suggested for you",R.drawable.baseline_more_vert_24,childProducts1));
        parentProductList.add(new ParentProduct("Recommended for you",R.drawable.baseline_arrow_forward_24,childProduct1s2));
        parentProductList.add(new ParentProduct("Productivity",R.drawable.baseline_arrow_forward_24,childProduct1s3));
        parentProductList.add(new ParentProduct("Because you like Google Drive",R.drawable.baseline_arrow_forward_24,childProduct1s4));
        parentProductList.add(new ParentProduct("Tools & utilities",R.drawable.baseline_arrow_forward_24,childProduct1s5));
        parentProductList.add(new ParentProduct("Just updated",R.drawable.baseline_arrow_forward_24,childProduct1s6));
        parentProductList.add(new ParentProduct("Social networking",R.drawable.baseline_arrow_forward_24,childProduct1s7));
        parentProductList.add(new ParentProduct("Discover science",R.drawable.baseline_arrow_forward_24,childProduct1s8));
        parentProductList.add(new ParentProduct("Learn a language",R.drawable.baseline_arrow_forward_24,childProduct1s9));
        return parentProductList;
    }

}