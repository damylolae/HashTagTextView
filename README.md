# HashTagTextView
A light weight helper class to enable hashtag Highlighting , click listener and customization 
<img src="https://github.com/damylolae/HashTagTextView/blob/main/Screenshot_20231114-024500.jpg"/>
# Setting Up 
download the pre-built jar from [Releases](https://github.com/damylolae/HashTagTextView/releases/tag/V1.0) 
and add it to your project, that easy :) .
# Code Samples 
A very basic usage is : 
```java
HashTagHelper hashTagHelper = new HashTagHelper(textview1,text); 
```
#### customizing:
```xml
HashTagHelper hashTagHelper = new HashTagHelper(textview1,text); // where textview1 is our TextView and text is our String

hashTagHelper.setUnderLineText(true); //set whether or not to underline hashtag texts, defaults to true

HashTagHelper.ClickListener listener = new HashTagHelper.ClickListener(){
		@Override
		public void onTextClicked (View v,String word){
				//handle click  actions 
		}};

hashTagHelper.setOnClickListener(listener); // passing click listener to the helper class 

hashTagHelper.setHighlightColor(Color.parseColor("#009688")); // highlight text color 

hashTagHelper.highLightText(text); // for refreshing or updating changes
```
# Community
Telegram: [Link](https://t.me/deftclicksapp) <br><br>
WhatsApp: [Link](https://chat.whatsapp.com/I6nBXEvweugHOGCYuQ2KWU)
