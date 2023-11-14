# HashTagTextView
A light weight helper class to enable hashtagHighlighting , click listener and customization 

# Setting Up 
download the pre-built jar from [Releases](https://github.com/damylolae/HashTagTextView/releases/tag/V1.0) 
and add it to your project, that easy :) .
# Code Samples 
A very basic usage is :
</>HashTagHelper hashTagHelper = new HashTagHelper(textview1,text); </>

customizing:
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
