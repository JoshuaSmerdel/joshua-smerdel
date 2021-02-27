<template>
  <div class="main">
    <h1>Product Reviews for ...{{ title }}</h1>
    <p>{{ description }}</p>

<!--    add the summary wells here-->
    <div class="well-display">
      <div class="well">
        <span class="amount">{{averageRating}}</span>
        Average Rating
      </div>
      <div class="well">
        <span class="amount"></span>
        1 Star Review
      </div>
      <div class="well">
        <span class="amount">...</span>
        2 Star Review
      </div>
      <div class="well">
        <span class="amount">...</span>
        3 Star Review
      </div>
      <div class="well">
        <span class="amount">...</span>
        4 Star Review
      </div>
      <div class="well">
        <span class="amount">...</span>
        5 Star Review
      </div>
    </div>

    <!--Loop through all reviews-->
    <div class="review"
         v-for="review in reviews"
         v-bind:key="review.id">
      <h4>
        {{ review.reviewer }}
      </h4>
      <div class="rating">
        <img src="../assets/star.png" alt="star image" v-for="n in review.rating" v-bind:key="n">
      </div>
      <h3>{{ review.title }}</h3>
      <p>{{ review.review }}</p>
    </div>
  </div>

</template>

<script>
export default {
//  this is my model for the view
//  name is required - used for the HTML tag
  name: 'product-reviews',
  data() {
    return {
      title: 'Cigar Parties for Dummies.',
      description: 'Host and plan the perfect party',
      reviews: [
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
              "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          isFavorite: false
        },
        {
          reviewer: "Tim Ferriss",
          title: "Had a cigar party started in less than 4 hours.",
          review:
              "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
          rating: 4,
          isFavorite: false
        },
        {
          reviewer: "Ramit Sethi",
          title: "What every new entrepreneurs needs. A door stop.",
          review:
              "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
          rating: 1,
          isFavorite: false
        },
        {
          reviewer: "Gary Vaynerchuk",
          title: "And I thought I could write",
          review:
              "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
          rating: 3,
          isFavorite: false
        }
      ]
    };
  },
  computed: {
    averageRating() {
      const sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);

      return sum / this.reviews.length;
    }
  }
}


</script>

<style scoped>

</style>