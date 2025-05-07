<?php
$Mat = 85;
$Phy = 90;
$Che = 75;
$Bio = 80;
$Eng = 95;


$totalMarks = $Mat + $Phy + $Che + $Bio + $Eng;
$percentage = ($totalMarks / 500) * 100;

echo "Total Marks: ". $totalMarks ."<br>";
echo "Percentage: ".$percentage."%<br>";

if ($percentage >= 90) {
    $grade = "Distinction";
} else {
    if ($percentage >= 80) {
        $grade = "A";
    } else {
        if ($percentage >= 70) {
            $grade = "B";
        } else {
            if ($percentage >= 60) {
                $grade = "C";
            } else {
                $grade = "F";
            }
        }
    }
}
echo "Grade: ".$grade;
?>
