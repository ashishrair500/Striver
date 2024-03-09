<h2><a href="https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/"><div id="big-omega-company-tags"><div id="big-omega-topbar"><div class="companyTagsContainer" style="overflow-x: scroll; flex-wrap: nowrap;"><div class="companyTagsContainer--tag" style="background-color: rgba(0, 10, 32, 0.05);"><div>Microsoft</div><div class="companyTagsContainer--tagOccurence">2</div></div></div><div class="companyTagsContainer--chevron"><div><svg version="1.1" id="icon" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 32 32" fill="#4087F1" xml:space="preserve" style="width: 20px;"><polygon points="16,22 6,12 7.4,10.6 16,19.2 24.6,10.6 26,12 "></polygon><rect id="_x3C_Transparent_Rectangle_x3E_" class="st0" fill="none" width="32" height="32"></rect></svg></div></div></div></div>2259. Remove Digit From Number to Maximize Result</a></h2><h3>Easy</h3><hr><div><p>You are given a string <code>number</code> representing a <strong>positive integer</strong> and a character <code>digit</code>.</p>

<p>Return <em>the resulting string after removing <strong>exactly one occurrence</strong> of </em><code>digit</code><em> from </em><code>number</code><em> such that the value of the resulting string in <strong>decimal</strong> form is <strong>maximized</strong></em>. The test cases are generated such that <code>digit</code> occurs at least once in <code>number</code>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<pre><strong>Input:</strong> number = "123", digit = "3"
<strong>Output:</strong> "12"
<strong>Explanation:</strong> There is only one '3' in "123". After removing '3', the result is "12".
</pre>

<p><strong class="example">Example 2:</strong></p>

<pre><strong>Input:</strong> number = "1231", digit = "1"
<strong>Output:</strong> "231"
<strong>Explanation:</strong> We can remove the first '1' to get "231" or remove the second '1' to get "123".
Since 231 &gt; 123, we return "231".
</pre>

<p><strong class="example">Example 3:</strong></p>

<pre><strong>Input:</strong> number = "551", digit = "5"
<strong>Output:</strong> "51"
<strong>Explanation:</strong> We can remove either the first or second '5' from "551".
Both result in the string "51".
</pre>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>

<ul>
	<li><code>2 &lt;= number.length &lt;= 100</code></li>
	<li><code>number</code> consists of digits from <code>'1'</code> to <code>'9'</code>.</li>
	<li><code>digit</code> is a digit from <code>'1'</code> to <code>'9'</code>.</li>
	<li><code>digit</code> occurs at least once in <code>number</code>.</li>
</ul>
</div>