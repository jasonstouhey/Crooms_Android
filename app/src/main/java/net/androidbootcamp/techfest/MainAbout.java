package net.androidbootcamp.techfest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Alex Quach on 3/1/2017.
 */

public class MainAbout extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        final TextView Change = ((TextView)findViewById(R.id.txtView));
        Change.setText("ABOUT CROOMS ACADEMY \n\n" +
                "\tCrooms Academy of Information Technology began as Crooms High School. It was founded by one of the nation's outstanding pioneers of education for black students, Professor Joseph Nathaniel Crooms. A graduate of Hampton University and Florida A & M University, Crooms was known for his untiring efforts and energies in the promotion of education for black youth in Florida, as well as the development of schools in Sanford, Florida. In 1910, Crooms obtained approval for a new school building. He developed the plans and selected the school site. In 1926, Crooms Academy was constructed as a high school for black students. It was named after Professor Crooms by a community grateful for his dedication and energy in pursuit of educational opportunity for its students. \n\n" +
                "\tThe mission of Crooms Academy of Information Technology is to provide innovative teaching and learning in a technology-enriched environment and to engage students in an academically challenging curriculum that prepares them for post-secondary education with industry-validated technology skills. \n\n" +
                "\tCrooms Academy of Information Technology is Seminole County Public Schools only dedicated magnet high school. All students who reside in Seminole County and have successfully completed the 8 th grade may apply for admission. Students must submit the High School Magnet Program Application through SCPS Choices Department and be chosen in the random selection process. \n\n" +
                "\tThe school offers a well-rounded high school experience with a rigorous academic program and technology focused coursework in different areas of information technology. Computer programming, digital design, game development, 3D Modeling &amp; Animation, iOS and Android app development, and network systems technology are just some of the technological courses offered by our magnet program. Crooms students benefit from a small school environment and individualized attention, opportunities to earn college credit through the Early College program at Seminole State College of Florida and Advanced Placement Coursework. A partnership with Seminole State College offers a pathway allowing students to earn the Associate of Arts degree in Information Technology while earning their high school diploma. \n\n" +
                "\tStudents have the opportunity to earn technology certifications as an Adobe Certified Associate in Dreamweaver, Flash, Photoshop, Premiere Pro, InDesign, and Illustrator; Cisco Certified Network Associate (CCNA); CompTIA A+, Linux+, Network+, Security+; Microsoft Office Specialist (MOS); Microsoft Technical Associate (MTA) in Windows Operating System Fundamentals; Autodesk 3ds Max; National Center for Simulation Modeling and Simulation; and Oracle Certified Associate. \n\n" +
                "\tCrooms Academy of IT is the highest performing high school in Seminole County and has a school grade of “A” on Florida’s High School Accountability Report. The school is ranked as one of the top 10% of the highest performing high schools within the state of Florida. Crooms Academy of IT has been recognized as a Distinguished Academy for the past six years by the National Academy Foundation and has recently been honored as a Magnet School of Distinction by Magnet Schools of America. The school has been consistently recognized as one of the best high schools in the US by US News and World Report and is listed on the Washington Post’s list of Most Challenging High Schools. Crooms Academy of IT is also ranked No. 1 in the nation on US News and World Report’s rankings of Most Connected Classrooms. Demetria Faison, the principal, was selected as a finalist for the 2016-2017 Innovative Principal of the Year award. \n\n" +
                "\tFor more information about the Crooms Business Advisory Council visit CroomsBac.org \n\n" +
                "\n\nMainAbout TechFest \n\n" +
                "\tTechFest is the signature event of the Crooms Business Advisory Council (BAC). In the eleventh year, TechFest has raised over $209,000. The proceeds supports scholarships, curriculum, career and college related programs, job shadowing field trips and internship opportunities. Over $106,000 in scholarships have been awarded Crooms graduates. \n\n" +
                "\tStudents will have the opportunity to network with two keynote speakers along with over thirty workshops presenters and the sponsors in the exhibition hall area. TechFest allows students, teachers and the business community to explore the \"wow\" in IT. This is a great opportunity for all participants to come together and share valuable information and resources in order to grow the future pipeline for high tech careers. \n\n" +
                "\tOn behalf of Crooms AOIT, we want to thank our business community for recharging, connecting and investing in our students and teachers. Community engagement and collaboration is the best way to build relationships. \n\n" +
                "\tTechFest, it’s your Hi-Tech Community, Get into IT! For more information visit Techfest.croomsweb.org");

    }
}