package com.example.rb.inceptum;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class QuizDbHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="Squaresandcubes.db";
    private static final int DATABASE_VERSION=1;

    private SQLiteDatabase db;

    public QuizDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        this.db=db;
        final String SQL_CREATE_QUESTIONS_TABLE = "CREATE TABLE " +
                QuizContract.QuestionTable.TABLE_NAME + " ( " +
                QuizContract.QuestionTable._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                QuizContract.QuestionTable.COLUMN_QUESTION+ " TEXT, " +
                QuizContract.QuestionTable.COLUMN_ANSWER + " TEXT, " +
                QuizContract.QuestionTable.COLUMN_DIFFICULTY + " TEXT" +
                ")";

        db.execSQL(SQL_CREATE_QUESTIONS_TABLE);
     fillquestiontable();


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
     db.execSQL("DROP TABLE IF EXISTS " + QuizContract.QuestionTable.TABLE_NAME);
     onCreate(db);
    }

    private void fillquestiontable()
    {
     question q1=new question("15²","225","Easy");
     addquestion(q1);
        question q2=new question("18²","324","Easy");
        addquestion(q2);
        question q3=new question("19²","361","Easy");
        addquestion(q3);
        question q4=new question("30²","900","Easy");
        addquestion(q4);
        question q5=new question("41²","1681","Easy");
        addquestion(q5);
        question q6=new question("25²","625","Easy");
        addquestion(q6);
        question q7=new question("35²","1225","Easy");
        addquestion(q7);
        question q8=new question("12²","144","Easy");
        addquestion(q8);
        question q9=new question("10²","100","Easy");
        addquestion(q9);
        question q10=new question("5³","125","Easy");
        addquestion(q10);
        question q11=new question("2⁵","32","Easy");
        addquestion(q11);
        question q12=new question("3³","27","Easy");
        addquestion(q12);
        question q13=new question("50²","2500","Easy");
        addquestion(q13);
        question q14=new question("1.5²","2.25","Easy");
        addquestion(q14);
        question q15=new question("100³","1000000","Easy");
        addquestion(q15);
        question q16=new question("17²","289","Easy");
        addquestion(q16);
        question q43=new question("555+666","1221","Easy");
        addquestion(q43);
        question q44=new question("32+34","66","Easy");
        addquestion(q44);

        question q45=new question("1221-1008","213","Easy");
        addquestion(q45);

        question q46=new question("30³","27000","Easy");
        addquestion(q46);



        question q55=new question("22*5","110","Easy");
        addquestion(q55);

        question q56=new question("80/4","20","Easy");
        addquestion(q56);

        question q57=new question("3³","81","Easy");
        addquestion(q57);

        question q58=new question("41/4","10.25","Easy");
        addquestion(q58);
        question q59=new question("111/2","505.5","Easy");
        addquestion(q59);




        question q79=new question("51/5","10.2","Easy");
        addquestion(q79);





        question q130=new question("33/11","3","Medium");
        addquestion(q130);

        question q131=new question("80/16-3","2","Medium");
        addquestion(q131);

        question q132=new question("(12²)-(11²)","23","Medium");
        addquestion(q132);

        question q133=new question("34*0.5","17","Medium");
        addquestion(q133);

        question q134=new question("22/5.5","4","Medium");
        addquestion(q134);

        question q135=new question("4/5","0.8","Medium");
        addquestion(q135);

        question q136=new question("11/5","2.2","Medium");
        addquestion(q136);

        question q137=new question("153/9","17","Medium");
        addquestion(q137);
        question q138=new question("6*7*2","84","Medium");
        addquestion(q138);
        question q139=new question("2*3*3*1*2","36","Medium");
        addquestion(q139);
        question q140=new question("2⁵","32","Medium");
        addquestion(q140);
        question q141=new question("32-78+86","40","Medium");
        addquestion(q141);
        question q142=new question("55-44+33-22+11","33","Medium");
        addquestion(q142);
        question q143=new question("11-11*0.5","5.5","Medium");
        addquestion(q143);
        question q144=new question("12*17","204","Medium");
        addquestion(q144);
        question q145=new question("19*20","380","Medium");
        addquestion(q145);
        question q146=new question("45-23+56-46","32","Medium");
        addquestion(q146);
        question q147=new question("5*4/2*3","30","Medium");
        addquestion(q147);
        question q148=new question("8*8*8/64","8","Medium");
        addquestion(q148);
        question q149=new question("2+3+4+5+66","80","Medium");
        addquestion(q149);
        question q150=new question("7+8+9+10","36","Medium");
        addquestion(q150);
        question q151=new question("11³","1331","Medium");
        addquestion(q151);

        question q152=new question("46.5/2","23.25","Medium");
        addquestion(q152);
        question q153=new question("1.25*4³","5","Medium");
        addquestion(q153);
        question q154=new question("252/3","84","Medium");
        addquestion(q154);
        question q155=new question("22/4","5.5","Medium");
        addquestion(q155);
        question q156=new question("65/13+13","18","Medium");
        addquestion(q156);
        question q157=new question("33/66+1","1.5","Medium");
        addquestion(q157);
        question q158=new question("7+8+9-15","9","Medium");
        addquestion(q158);
        question q159=new question("54-66/3","32","Medium");
        addquestion(q159);
        question q160=new question("87-55+49","81","Medium");
        addquestion(q160);
        question q161=new question("76+7*6-3","115","Medium");
        addquestion(q161);
        question q162=new question("90/18-8+21","18","Medium");
        addquestion(q162);


        question q163=new question("1331/11","121","Hard");
        addquestion(q163);
        question q164=new question("12*11","168","Hard");
        addquestion(q164);
        question q165=new question("9*19","171","Hard");
        addquestion(q165);
        question q166=new question("78-8²","14","Hard");
        addquestion(q166);

        question q167=new question("1555-11³","224","Hard");
        addquestion(q167);

        question q168=new question("2.5²","6.25","Hard");
        addquestion(q168);
        question q169=new question("1.8²","3.24","Hard");
        addquestion(q169);
        question q170=new question("13²","169","Hard");
        addquestion(q170);
        question q171=new question("11³-10³","331","Hard");
        addquestion(q171);
        question q172=new question("24*12","288","Hard");
        addquestion(q172);
        question q173=new question("4⁴","256","Hard");
        addquestion(q173);
        question q174=new question("1.6²","2.56","Hard");
        addquestion(q174);
        question q175=new question("7³","343","Hard");
        addquestion(q175);
        question q176=new question("12*98","1176","Hard");
        addquestion(q176);
        question q177=new question("(2+3)*6+4","34","Hard");
        addquestion(q177);
        question q178=new question("(8/32)*4+12","13","Hard");
        addquestion(q178);
        question q179=new question("1555-222-333","1000","Hard");
        addquestion(q179);
        question q180=new question("23*5","115","Hard");
        addquestion(q180);
        question q181=new question("45*5","225","Hard");
        addquestion(q181);
        question q182=new question("882/3","294","Hard");
        addquestion(q182);
        question q183=new question("345/5","69","Hard");
        addquestion(q183);

        question q184=new question("12.5/2.5","5","Hard");
        addquestion(q184);

        question q185=new question("14/5","2.4","Hard");
        addquestion(q185);

        question q186=new question("123/12.3","10","Hard");
        addquestion(q186);

        question q187=new question("1.1*40","44","Hard");
        addquestion(q187);

        question q188=new question("9.2+4.8","14","Hard");
        addquestion(q188);

        question q189=new question("7.9+6.1+7.3","21.3","Hard");
        addquestion(q189);

        question q190=new question("88*9","792","Hard");
        addquestion(q190);

        question q191=new question("4+5*2-4","10","Hard");
        addquestion(q191);

        question q192=new question("12*4-22*2","4","Hard");
        addquestion(q192);

        question q193=new question("5*5+5/5","26","Hard");
        addquestion(q193);

        question q194=new question("54*12","648","Hard");
        addquestion(q194);

        question q195=new question("1212/3-300","104","Hard");
        addquestion(q195);


        question q196=new question("561/3","187","Hard");
        addquestion(q196);


        question q197=new question("12+32+12/4","47","Hard");
        addquestion(q197);


        question q198=new question("12*13","156","Hard");
        addquestion(q198);


        question q199=new question("45*4-30","150","Hard");
        addquestion(q199);


        question q200=new question("55²","3025","Hard");
        addquestion(q200);


        question q201=new question("9³","729","Hard");
        addquestion(q201);


        question q202=new question("41²","1681","Hard");
        addquestion(q202);

    }
    private void addquestion(question question)
    {
        ContentValues cv=new ContentValues();
        cv.put(QuizContract.QuestionTable.COLUMN_QUESTION,question.getQuestion());
        cv.put(QuizContract.QuestionTable.COLUMN_ANSWER,question.getAnswer());
        cv.put(QuizContract.QuestionTable.COLUMN_DIFFICULTY,question.getDifficulty());

        db.insert(QuizContract.QuestionTable.TABLE_NAME,null,cv);

    }
    public List<question> getallquestions()
    {
        List<question> questionList=new ArrayList<>();
        db=getReadableDatabase();
        String[] selectionArgs = new String[]{};
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionTable.TABLE_NAME, null);
       if(c.moveToFirst()){
           do{
               question question=new question();
               question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_QUESTION)));
               question.setAnswer(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_ANSWER)));
               question.setDifficulty(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_DIFFICULTY)));


               questionList.add(question);
           }
           while (c.moveToNext());



       }
c.close();
       return questionList;
    }
    public List<question> getquestions(String difficulty)
    {
        List<question> questionList=new ArrayList<>();
        db=getReadableDatabase();
        String[] selectionArgs=new String[]{difficulty};
        Cursor c = db.rawQuery("SELECT * FROM " + QuizContract.QuestionTable.TABLE_NAME +
                " WHERE " + QuizContract.QuestionTable.COLUMN_DIFFICULTY + "=?", selectionArgs);
        if(c.moveToFirst()){
            do{
                question question=new question();
                question.setQuestion(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_QUESTION)));
                question.setAnswer(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_ANSWER)));
                question.setDifficulty(c.getString(c.getColumnIndex(QuizContract.QuestionTable.COLUMN_DIFFICULTY)));




                questionList.add(question);
            }
            while (c.moveToNext());



        }
        c.close();
        return questionList;
    }
}
