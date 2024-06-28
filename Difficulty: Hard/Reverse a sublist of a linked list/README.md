<h2><a href="https://www.geeksforgeeks.org/problems/reverse-a-sublist-of-a-linked-list/1">Reverse a sublist of a linked list</a></h2><h3>Difficulty Level : Difficulty: Hard</h3><hr><div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a linked list and positions a and b. Reverse the linked list from position b to a.</span></p>
<p><strong><span style="font-size: 18px;">Example 1:</span></strong></p>
<pre><strong><span style="font-size: 18px;">Input :</span></strong>
<span style="font-size: 18px;">N = 10</span>
<span style="font-size: 18px;">Linked List = 1-&gt;7-&gt;5-&gt;3-&gt;9-&gt;8-&gt;10
</span><span style="font-size: 18px;">                      -&gt;2-&gt;2-&gt;5-&gt;NULL</span>
<span style="font-size: 18px;">a = 1, b = 8</span>
<span style="font-size: 18px;"><strong>Output :</strong> 2 10 8 9 3 5 7 1 2 5 </span>
<strong><span style="font-size: 18px;">Explanation :</span></strong>
<span style="font-size: 18px;">The nodes from position 1 to 8 
are reversed, resulting in 
</span><span style="font-size: 18px;">2 10 8 9 3 5 7 1 2 5.</span>

</pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
N = 6
Linked List = 1-&gt;2-&gt;3-&gt;4-&gt;5-&gt;6-&gt;NULL
a = 2, b = 4</span>
<span style="font-size: 18px;"><strong>Output:</strong> 1 4 3 2 5 6</span>
<strong><span style="font-size: 18px;">Explanation:</span></strong>
<span style="font-size: 18px;">Nodes from position 2 to 4 
are reversed resulting in</span>
<span style="font-size: 18px;">1 4 3 2 5 6.</span></pre>
<div><strong><span style="font-size: 18px;">Your task :</span></strong></div>
<div><span style="font-size: 18px;">You don't need to read input or print anything. Your task is to complete the function <strong>reverseBetween()</strong> which takes the head of the linked list and two integers a and b as input and returns the head of the new linked list after reversing the nodes from position a to b.</span></div>
<div>&nbsp;</div>
<div><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N)</span></div>
<div><span style="font-size: 18px;"><strong>Expected Auxiliary Space: </strong>O(1)</span></div>
<div>&nbsp;</div>
<div><strong><span style="font-size: 18px;">Constraints:</span></strong></div>
<div><span style="font-size: 18px;">1&lt;=N&lt;=10^5</span></div>
<div><span style="font-size: 18px;">1&lt;=a&lt;=b&lt;=N</span></div>
<div><span style="font-size: 18px;">1&lt;=element&lt;=10<sup>9</sup></span></div></div><p><span style=font-size:18px><strong>Company Tags : </strong><br><code>Microsoft</code>&nbsp;<br><p><span style=font-size:18px><strong>Topic Tags : </strong><br><code>Linked List</code>&nbsp;<code>Data Structures</code>&nbsp;