<h2><a href="https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-a-rotated-array">Search in a Rotated Array</a></h2><h3>Difficulty Level : Medium</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a sorted and rotated array <strong>A</strong> of <strong>n</strong> distinct elements which is rotated at some point, and given an element <strong>key</strong>. The task is to find the index of the given element <strong>key</strong> in the array <strong>A</strong>. The whole array <strong>A</strong> is given as the range to search.<br><strong>Note</strong>:- You are given l and h where l=0 and h=n-1.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
n = 9
A[] = {5, 6, 7, 8, 9, 10, 1, 2, 3}
key = 10
l = 0 , h = 8
<strong>Output</strong>:
5
<strong>Explanation</strong>: <br>10 is found at index 5.</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2</strong>:</span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>:
n = 4
A[] = {3, 5, 1, 2}
key = 6
l = 0 , h = 3</span><span style="font-size: 18px;"><strong>
Output</strong>:
-1</span><span style="font-size: 18px;"><strong>
Explanation</strong>: <br>There is no element that has value 6.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task</strong>:<br>Complete the function&nbsp;search()&nbsp;which takes an array <strong>arr</strong>[] and <strong>start</strong>,&nbsp;<strong>end</strong> index of the array and the <strong>key</strong> as input parameters, and returns the answer.<br><br>Can you solve it in expected time complexity?</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity</strong>:&nbsp;O(log N).<br><strong>Expected Auxiliary Space</strong>:&nbsp;O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints</strong>:<br>1 ≤ N ≤ 10<sup>7</sup><br>0 ≤ A[i] ≤ 10<sup>8</sup><br>1 ≤ key ≤ 10<sup>8</sup></span></p></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Paytm</code>&nbsp;<code>Flipkart</code>&nbsp;<code>Amazon</code>&nbsp;<code>Microsoft</code>&nbsp;<code>Snapdeal</code>&nbsp;<code>D-E-Shaw</code>&nbsp;<code>FactSet</code>&nbsp;<code>Hike</code>&nbsp;<code>MakeMyTrip</code>&nbsp;<code>Intuit</code>&nbsp;<code>Adobe</code>&nbsp;<code>Google</code>&nbsp;<code>BankBazaar</code>&nbsp;<code>Times Internet</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Searching</code>&nbsp;<code>Divide and Conquer</code>&nbsp;<code>Algorithms</code>&nbsp;