@Regression

Feature: Create Post from Newsfeed webpage

  Background:
    Given Organization-Admin inserts valid username "hamed+qusai@parent.cloud"
    And inserts valid password "12345678"
    When clicks on submit button
    Then Dashboard webpage is displayed by default
    When Organization-Admin clicks on Newsfeed tab

  #Scenario1
  Scenario: Verify that when Organization-Admin clicks on "Write your post here" in Newsfeed screen,
    He will be able to write a post and publish it.


    And clicks on "Write your post here"
    And clicks on "search for recipients"
    And writes "New post is published now by automation test"
    And clicks on post button
#    Then the post will be published


  #Scenario2
 Scenario: Verify that when Organization-Admin clicks on "Edit post" in Newsfeed screen,
  He will be able to edit a post and re-publish it.

    When clicks on Edit button
    And Edit post "new edited Post now"
    And clicks on post button
#   Then the post will be published

      #Scenario3
  Scenario: Verify that when Organization-Admin clicks on "Delete Post" in Newsfeed screen,
  He will be able to delete a post.

    When clicks on Delete Post
    And Confirm post is deleted


          #Scenario4
  Scenario: Verify that when Organization-Admin clicks on "Add Inspiration" in Newsfeed screen,
  He will be able to write a post and publish it.

    And clicks on "Add Inspiration"
    And selects "Public Inspiration"
    And clicks on "search for recipients"
    And writes "fourth automated post here"
    And clicks on post button
#    Then the post will be published

