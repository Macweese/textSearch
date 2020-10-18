# Text Searcher
Simple tool written in java used to search a text for a specific keyword or phrase.

## Functions
- Search text for keyword/phrase (...search tool duh)
- Filter search by case sensitivity, distinguish between lower- and uppercase
- Regex and only search for and within complete words
- Intuitive and informative stats post operation

## Program Interface
![Program Interface](https://i.imgur.com/tM7XvTb.png)


## Case Sensitivity
This option is set to false by default.
- [ ] False - will not differintiate between lower- and uppercase letters.
- [x] True - will differintiate between lower- and uppercase letters.
<h6>Example<br>
  Enabled - Searching for 'hello' in a text containing 'hELLo' will give a matching hit.<br>
  Disabled - Searching for "USA' in a text containing 'Usain Bolt' will NOT yield a matching result.</h6>

![Program Interface](https://i.imgur.com/x30E0oV.png)

## Console Stats
This option is set to false by default.
The program will always give the number of times a searched term was found within a text according to the users' settings in a message box after executing.
However, sometimes it can be nice to have a little more information.
- [ ] False - will not provide any additional stats beyond the default message popup.
- [x] True - will print stats in the console for the user.
<h6> Example<br>
  The index of every matched entry within the searched text.<br>
  The body of text that was searched.<br>
  The keyword that was searched.<br>
  The configuration settings which were used for the specific search.<br>
  The amount of matched results.
</h6>

![Program Interface](https://i.imgur.com/q1dSs1f.png)
![Program Interface](https://i.imgur.com/TFaOmkJ.png)

## Regex
This option is set to false by default so you can search long phrases or a sequence of words.

- [ ] False - will search the entire text for any match.
- [x] True - will only search words and substrings of words.
<h6> Example<br>
  Disabled - Searching for 'd s' with the regex option disabled in a text containing 'red sky' will yeild a matching result.<br>
  Enabled - Searching for 'd s' with the regex option enabled in a text containing 'red sky' will not yeild any matching results.<br>


![Program Interface](https://i.imgur.com/AvWXVsi.png)

###### Note that the regex filter splits by white-spaces (blanks) meaning any search term containing a white-space (blank) will always have zero matches while the regex is enabled.

## Errors and other things
If the user does not provide both a valid search term and text you'll be prompted with an error message informing you of such.


## F.A.Q.
- <b>Why does my program not look like the one in the picture?</b><br>
   A lot of these images were taking during development and as such changes were made after some images were captured. Such as redesign of the buttons or changing other UI components. I've also made changes to my registry changing the design of Windows entirely. These would be the main reasons behind the different looks. Nonetheless, the fundamental layout of the interface and functions remain the same.

- <b>How many characters can I search for and how big can the text I want to search be?</b><br>
   By the settings I've put you'd be able to fit in any reasonable text and search term. However, you are able to stretch the window to fit your screen, and the text area will automatically resize itself. So as much text you can fit in that area (you can still paste/write beyond what you are able to see but you probably won't see the added text - since there is no scrollbar). As for the search term the same thing applies, except the text field is much smaller.
   
- <b>Why are the images blurred?</b><br>
   The images were taken during development and contained personal/sensitive information, to post the illustrations publicly I redacted the information in question. The relating code was also redacted.
   
- <b>Does this work?</b><br>
   Yes
   
   
## Contact & Other Information
Made by [Macweese](https://github.com/Macweese)<br>
Contact me through Github or email at <macweese@pm.me>

## Update log
- <b>2020-10-17 Launch</b><br>
  Files and repository created. Posted to Github.<br>
 
- <b>2020-10-17 Patch</b><br>
  `README.md` Edited<br>
  User manual & general guide posted.<br>
  
- <b>2020-10-18 Patch</b><br>
  More changes to `README.md`<br>
  User manual & general guide small changes.

