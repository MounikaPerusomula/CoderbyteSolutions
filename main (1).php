<?php
      $ch = curl_init('https://coderbyte.com/api/challenges/json/age-counting');
  curl_setopt($ch, CURLOPT_RETURNTRANSFER, true);
  curl_setopt($ch, CURLOPT_HEADER, 0);
  $data = curl_exec($ch);
  curl_close($ch);
  $newdata=json_decode($data, true);
  // reading the array from data and exploding the value and storing it in the new variable 
  $newdataset= explode(', ',$newdata['data']);
  $count=0; // to get the count
  foreach($newdataset as $keyvalue){ //looping through all the input
    $age=trim(explode('=',$keyvalue)[1]); // getting value of each element
    if(is_numeric($age) && $age>=50){ // checking weather the value is numeric and grater than 50
      $count++;// increment the count
    }
  }
  echo $count;
?>