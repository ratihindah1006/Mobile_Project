import android.util.Log;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 *
 * this fake data source class is a testing class that will be used to generate some random data
 *
 */
/**
 * this class provides a List of news item
 * this is how the news item data looks like in JSON format:
 * {
 *         "id" : 0,
 *         "title" : "Design A Simple UI Screen in Flare",
 *         "itemType" : 1,
 *         "newsContent" : "Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with: The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content.",
 *         "dramaImg" : "https://2.bp.blogspot.com/-ddZ2Tt8EOeo/XxtDIkHWgDI/AAAAAAAAAn0/vG13Vw5zoXU5fy_sHQ_7lW6PQz1UEXocACK4BGAYYCw/s1600/news5.PNG",
 *         "userImg" : "https://2.bp.blogspot.com/-6EcFUPmzExo/XxtD9BbEO4I/AAAAAAAAAo0/n-AxAZrAVLQBbzjcKhkIOHtSLixVUz0lgCK4BGAYYCw/s400/user3.png",
 *         "username" : "Invision Studio",
 *         "date" : "03/08/2020",
 *         "backgroundBg" : "RED"
 *     }
 */

public class FakeDataSource {


    Random random;

    public FakeDataSource() {
        random = new Random();
        initListDramaImages();
        initListUserImages();
        initListDramaTitle();
        initListUsername();
    }

    /** Drama item data format
     *
     *   this.id = id;
     *         this.title = title;
     *         this.username = username;
     *         this.dramaImg = dramaImg;
     *         this.userImg = userImg;
     *         this.dramaContent = dramaContent;
     *         this.bgColor = bgColor;
     *         this.date = date;
     *         this.viewType = viewType;
     */

    public List<DramaItem> getFakeListDrama() {


        List<DramaItem> data = new ArrayList<>();
        for(int index=0;index<30;index++) {

            DramaItem item = new DramaItem(index,
                    getRandomDramaTitle(),
                    getRandomUsername(),
                    getRandomDramaImage(),
                    getRandomUserImage(),
                    getRandomContent(),
                    getRandomBgColor(),
                    null,
                    generateViewType(index));
            data.add(item);

        }

        return data;
    }


    // generate a static list drama Items

    public List<DramaItem> getFakeStaticListDrama(){

        List<DramaItem> data = new ArrayList<>();
        data.add(new DramaItem(
                0,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                1,
                TXT_TITLE_02,
                TXT_NAME_02,
                IMG_DRAMA_02,
                IMG_USER_02,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                2,
                TXT_TITLE_03,
                TXT_NAME_03,
                IMG_DRAMA_03,
                IMG_USER_03,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                3,
                TXT_TITLE_04,
                TXT_NAME_04,
                IMG_DRAMA_02,
                IMG_USER_04,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                1
        ));

        data.add(new DRAMAItem(
                4,
                TXT_TITLE_05,
                TXT_NAME_01,
                IMG_DRAMA_03,
                IMG_USER_05,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                5,
                TXT_TITLE_03,
                TXT_NAME_01,
                IMG_DRAMA_02,
                IMG_USER_03,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                0
        ));


        data.add(new DramaItem(
                6,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                7,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[3],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                8,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_10,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                9,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_08,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                0
        ));

        return data;
    }

    // generate an updated static news list

    public List<DramaItem> getFakeUpdatedStaticListDrama(){
        List<DramaItem> data = new ArrayList<>();

        data.add(new DramaItem(
                -4,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_10,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                -3,
                TXT_TITLE_02,
                TXT_NAME_02,
                IMG_DRAMA_02,
                IMG_USER_02,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                -2,
                TXT_TITLE_03,
                TXT_NAME_03,
                IMG_DRAMA_07,
                IMG_USER_03,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                -1,
                TXT_TITLE_04,
                TXT_NAME_04,
                IMG_DRAMA_09,
                IMG_USER_04,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                1
        ));



        data.add(new DramaItem(
                0,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                1,
                TXT_TITLE_02,
                TXT_NAME_02,
                IMG_DRAMA_02,
                IMG_USER_02,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                2,
                TXT_TITLE_03,
                TXT_NAME_03,
                IMG_DRAMA_03,
                IMG_USER_03,
                LOREM_TEXT,
                lstColors[0],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                3,
                TXT_TITLE_04,
                TXT_NAME_04,
                IMG_DRAMA_02,
                IMG_USER_04,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                4,
                TXT_TITLE_05,
                TXT_NAME_01,
                IMG_DRAMA_03,
                IMG_USER_05,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                5,
                TXT_TITLE_03,
                TXT_NAME_01,
                IMG_DRAMA_02,
                IMG_USER_03,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                0
        ));


        data.add(new DramaItem(
                6,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                0
        ));

        data.add(new DramaItem(
                7,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_01,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[3],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                8,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_10,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[2],
                new Date(),
                1
        ));

        data.add(new DramaItem(
                9,
                TXT_TITLE_01,
                TXT_NAME_01,
                IMG_DRAMA_08,
                IMG_USER_01,
                LOREM_TEXT,
                lstColors[1],
                new Date(),
                0
        ));

        return data;
    }


    private void initListDramaImages() {
        listDramaImage.add(IMG_DRAMA_01);
        listDramaImage.add(IMG_DRAMA_02);
        listDramaImage.add(IMG_DRAMA_03);
        listDramaImage.add(IMG_DRAMA_04);
        listDramaImage.add(IMG_DRAMA_05);
        listDramaImage.add(IMG_DRAMA_06);
        listDramaImage.add(IMG_DRAMA_07);
        listDramaImage.add(IMG_DRAMA_08);
        listDramaImage.add(IMG_DRAMA_09);
        listDramaImage.add(IMG_DRAMA_10);
    }

    private void initListUserImages() {
        listUserImage.add(IMG_USER_01);
        listUserImage.add(IMG_USER_02);
        listUserImage.add(IMG_USER_03);
        listUserImage.add(IMG_USER_04);
        listUserImage.add(IMG_USER_05);
    }

    private void initListDramaTitle() {
        listDramaTitles.add(TXT_TITLE_01);
        listDramaTitles.add(TXT_TITLE_02);
        listDramaTitles.add(TXT_TITLE_03);
        listDramaTitles.add(TXT_TITLE_04);
        listDramaTitles.add(TXT_TITLE_05);
    }

    public void initListUsername(){
        listUserNames.add(TXT_NAME_01);
        listUserNames.add(TXT_NAME_02);
        listUserNames.add(TXT_NAME_03);
        listUserNames.add(TXT_NAME_04);
    }

    // Drama images url's for testing
    public static final String IMG_DRAMA_01 ="https://cdn2.caping.co.id/news/20200915/a3/1353533135A852A1200.jpg_480A0A1A80.webp";
    public static final String IMG_DRAMA_02 ="https://cdns.klimg.com/resized/476x/p/posterstartup4.jpg";
    public static final String IMG_DRAMA_03 ="https://i.pinimg.com/originals/5f/83/75/5f8375e2cdda3008fffad2bd08cdf786.png";
    public static final String IMG_DRAMA_04 ="https://assets.pikiran-rakyat.com/crop/0x0:0x0/x/photo/2020/09/04/3231298255.jpg";
    public static final String IMG_DRAMA_05 ="https://awsimages.detik.net.id/community/media/visual/2020/10/23/kim-hyo-jin-2_34.png?w=375";
    public static final String IMG_DRAMA_06 ="https://cdn2.caping.co.id/news/20200811/ec/0902585529A650A958.jpg_480A0A1A80.webp";
    public static final String IMG_DRAMA_07 ="https://i0.wp.com/www.jauhari.net/engine/wp-content/uploads/2020/06/Poster-K-Drama-Vagabond.jpg?fit=1080%2C1620&ssl=1";
    public static final String IMG_DRAMA_08 ="https://i.pinimg.com/originals/90/73/be/9073be059f9a0a98b92f76335f20f40c.jpg";
    public static final String IMG_DRAMA_09 ="https://id-articles.vuclip.com/wp-content/uploads/2020/10/drama-the-penthouse-sub-indo-viu-1-600x855.jpeg;
    public static final String IMG_DRAMA_10 ="https://upload.wikimedia.org/wikipedia/id/1/10/What%27s_Wrong_with_Secretary_Kim.jpg";

    List<String> listDramaImage = new ArrayList<>();

    // user images for testing
    public static final String IMG_USER_01 ="https://2.bp.blogspot.com/-6EcFUPmzExo/XxtD9BbEO4I/AAAAAAAAAo0/n-AxAZrAVLQBbzjcKhkIOHtSLixVUz0lgCK4BGAYYCw/s400/user3.png";
    public static final String IMG_USER_02 ="https://2.bp.blogspot.com/-R0rfeBv6PbA/XxtD75IBizI/AAAAAAAAAoU/xgUu9IuGwVcwpnihSXMNSZ9YhiNrIpTuwCK4BGAYYCw/s400/user4.png";
    public static final String IMG_USER_03 ="https://1.bp.blogspot.com/-7cV7-_0mgv8/XxtD9IRzJBI/AAAAAAAAAo4/WaMt1T9cfXgn1qGmnYa3oWGUEW2IQUbmACK4BGAYYCw/s400/user2.png";
    public static final String IMG_USER_04 ="https://cdn.dribbble.com/users/2400016/avatars/normal/401c4be556cfced8004233dad4afdd98.jpg?1592492657";
    public static final String IMG_USER_05 ="https://1.bp.blogspot.com/-crUZwpqquAo/XxtD7_lwqEI/AAAAAAAAAoY/TbRYnR82uk8LXrQpx-tsBA4-KyFISSFUgCK4BGAYYCw/s400/user.png";


    List<String> listUserImage = new ArrayList<>();


    // user titles for testing
    public static final String TXT_TITLE_01 = "Stack Overflow - Where Developers Learn, Share, and Build";
    public static final String TXT_TITLE_02 = "Book About Stars";
    public static final String TXT_TITLE_03 = "Design A Simple UI Screen in Flare";
    public static final String TXT_TITLE_04 = "Naija-based designer making stuff with Studio";
    public static final String TXT_TITLE_05 = "How To Write Better Resume";


    List<String> listDramaTitles = new ArrayList<>();


    // user names for testing
    public static final String TXT_NAME_01 = "Jona Dinges";
    public static final String TXT_NAME_02 = "Invision Studio";
    public static final String TXT_NAME_03 = "Benoit Drigny";
    public static final String TXT_NAME_04 = "Ada Vishneva";

    List<String>  listUserNames  = new ArrayList<>();


    // News content for testing
    public static final String LOREM_TEXT ="Lorem ipsum, or lipsum as it is sometimes known, is dummy text used in laying out print, graphic or web designs. The passage is attributed to an unknown typesetter in the 15th century who is thought to have scrambled parts of Cicero's De Finibus Bonorum et Malorum for use in a type specimen book. It usually begins with: The purpose of lorem ipsum is to create a natural looking block of text (sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not without controversy, laying out pages with meaningless filler text can be very useful when the focus is meant to be on design, not content." ;

    // news background colors
    static final String[] lstColors = {"RED","YELLOW","BLACK","PURPLE"};


    /**
     * this method generate a random news item
     */
    public DramaItem generateRandomDramaItem(){

        DramaItem item = new DramaItem(-1, getRandomDramaTitle(), getRandomUsername(), getRandomDramaImage(), getRandomUserImage(), getRandomContent(), getRandomBgColor(), null, 0);
        return item;

    }

    // generate a random string title
    private String getRandomDramaTitle() {
        int index = random.nextInt(listDramaTitles.size());
        return listDramaTitles.get(index);
    }

    // generate a random drama image url string
    private String getRandomDramaImage(){
        int index = random.nextInt(listDramaImage.size());
        return listDramaImage.get(index);
    }

    // generate a random drama image url string
    private String getRandomUserImage(){
        int index = random.nextInt(listUserImage.size());
        return listUserImage.get(index);
    }

    // generate a random String Content
    private String getRandomContent(){
        return LOREM_TEXT;
    }

    // generate a random String Content
    private String getRandomUsername(){
        int index = random.nextInt(listUserNames.size());
        return listUserNames.get(index);
    }

    // generate a random drama background color
    private String getRandomBgColor(){
        int index = random.nextInt(lstColors.length);
        return lstColors[index];
    }

    // generate random date
    private Date getRandomDate(){
        return new Date();
    }


    // generate a viewtype based on the index and the list size
    // this specify the view grid system of the format of the drama system list

    private int generateViewType(int position){

        if (position == 0) {
            return 1;
        }
        else if (position == 1) {
            return 0;
        }

        if (position != 0) {
            int ir = position/2 +1 ;
            Log.e("TAG", "generateViewType: "+ir );
            if(ir%2 == 0) {
                if (position %2 == 0) {
                    return 0;
                }
                else
                    return 1;
            }
            else
            {
                if (position %2 == 0) {
                    return 1;
                }
                else
                    return 0;
            }

        }

        return 0;
    }

}