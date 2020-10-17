# Text Searcher
Simple tool written in java used to search a text for a specific keyword.

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
<h6> Example
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
  Enabled - Searching for 'd s' with the regex option disabled in a text containing 'red sky' will yeild a matching result.<br>
  Disabled - Searching for 'd s' with the regex option enabled in a text containing 'red sky' will not yeild any matching results.

![Program Interface](https://i.imgur.com/AvWXVsi.png)

###### Note that the regex filter splits by white-spaces (blanks) meaning any search term containing a white-space (blank) will always have zero matches while the regex is enabled.

## Errors and other things
If the user does not provide both a valid search term and text you'll be prompted with an error message informing you of such.  



